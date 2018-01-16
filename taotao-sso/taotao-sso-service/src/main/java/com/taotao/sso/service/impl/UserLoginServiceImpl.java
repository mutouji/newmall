package com.taotao.sso.service.impl;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.JsonUtils;
import com.taotao.jedis.JedisClient;
import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import com.taotao.pojo.TbUserExample.Criteria;
import com.taotao.sso.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private TbUserMapper userMapper;

    @Autowired
    private JedisClient jedisClient;

    @Value("${SESSION_PRE}")
    private String SESSION_PRE;

    @Value("${SESSION_EXPIRE}")
    private Integer SESSION_EXPIRE;

	@Override
	public TaotaoResult login(String username, String password) {
        // 判断用户名和密码是否正确
        TbUserExample example = new TbUserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<TbUser> list = userMapper.selectByExample(example);
        if (list == null || list.size() == 0) {
            return TaotaoResult.build(400, "用户名或密码错误");
        }
        // 校验密码，密码要进行md5加密后再校验
        TbUser user = list.get(0);
        if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())) {
            return TaotaoResult.build(400, "用户名或密码错误");
        }
        // 生成一个token
        String token = UUID.randomUUID().toString();
        // 把用户信息保存到Redis数据库里面去
        // key就是token，value就是用户对象转换成json
        user.setPassword(null); // 为了安全，就不要把密码保存到Redis数据库里面去，因为这样太危险了，因此我们先把密码置空 
        jedisClient.set(SESSION_PRE + ":" + token, JsonUtils.objectToJson(user));
        // 设置key的过期时间
        jedisClient.expire(SESSION_PRE + ":" + token, SESSION_EXPIRE);
        // 返回结果
        return TaotaoResult.ok(token);
	}
	
	public TaotaoResult getUserByToken(String token) {
		// 根据token到Redis数据库中查询用户信息
		String json = jedisClient.get(SESSION_PRE + ":" + token);
		if (StringUtils.isBlank(json)) {
			return TaotaoResult.build(400, "此用户登录已经过期");
		}
		// 重置过期时间
		jedisClient.expire(SESSION_PRE + ":" + token, SESSION_EXPIRE);
		// 转成用户对象
		TbUser user = JsonUtils.jsonToPojo(json, TbUser.class);
		// 返回 结果
		return TaotaoResult.ok(user);
		
	}
	
	public TaotaoResult logout(String token) {
		jedisClient.expire(SESSION_PRE + ":" + token, 0);
		return TaotaoResult.ok();
	}

}
