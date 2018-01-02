package com.taotao.jedis;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taotao.content.jedis.JedisClient;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class JedisTest {

	// 单redis
	@Test
	public void testJedisSingle() {
		Jedis jedis = new Jedis("192.168.244.146", 6379);
		jedis.set("mytest", "1000");
		String result = jedis.get("mytest");
		System.out.println(result);
		jedis.close();
	}
	// 单redis+连接池
	@Test
	public void testJedisPool() {
		JedisPool jedisPool = new JedisPool("192.168.244.146", 6379);
		// 获取链接
		Jedis jedis = jedisPool.getResource();
		String result = jedis.get("mytest");
		System.out.println(result);
		jedis.close();
		jedisPool.close();
	}
	// redis集群
	@Test
	public void testJedisCluster() {
		Set<HostAndPort> nodes = new HashSet<HostAndPort>();

		nodes.add(new HostAndPort("192.168.244.146", 7001));
		nodes.add(new HostAndPort("192.168.244.146", 7002));
		nodes.add(new HostAndPort("192.168.244.146", 7003));
		nodes.add(new HostAndPort("192.168.244.146", 7004));
		nodes.add(new HostAndPort("192.168.244.146", 7005));
		nodes.add(new HostAndPort("192.168.244.146", 7006));
		
		JedisCluster jedisCluster = new JedisCluster(nodes);
		jedisCluster.set("jedisCluster", "sdf");
		String result = jedisCluster.get("jedisCluster");
		System.out.println(result);
		try {
			jedisCluster.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// test时得把applicationContext-redis.xml文件中用于测试的开启注解的配置<context:annotation-config/>加上！！
	// 不test时要去掉，因为在applicationContext-service.xml中的 <context:component-scan base-package="com.taotao.content.service">中，隐含了
	@Test
	public void testJedisClientPool() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
		JedisClient jedisClient = applicationContext.getBean(JedisClient.class);
		jedisClient.set("client", "hello");
		String result = jedisClient.get("client");
		System.out.println(result);
	}
}
