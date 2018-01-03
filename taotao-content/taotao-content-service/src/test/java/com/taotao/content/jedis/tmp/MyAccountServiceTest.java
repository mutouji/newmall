package com.taotao.content.jedis.tmp;

import org.junit.Test;

import com.taotao.content.jedis.tmp.MyAccountService;

public class MyAccountServiceTest {

	@Test
	public void testManualRedis() {
	    MyAccountService s = new MyAccountService(); 
	    // 开始查询账号
	    s.getAccountByName("somebody");// 第一次查询，应该是数据库查询
	    s.getAccountByName("somebody");// 第二次查询，应该直接从缓存返回
	    
	    s.reload();// 重置缓存
	    System.out.println("after reload..."); 
	    
	    s.getAccountByName("somebody");// 应该是数据库查询
	    s.getAccountByName("somebody");// 第二次查询，应该直接从缓存返回
	}
}
