package com.taotao.content.jedis.tmp;

import org.junit.Test;
import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.taotao.content.jedis.tmp.Account;

public class AccountServiceTest {
	@Test
  public void testGetAccountByName() { 
    ApplicationContext context = new ClassPathXmlApplicationContext( 
       "classpath:spring/spring-cache-anno.xml");// 加载 spring 配置文件
    AccountService s = (AccountService) context.getBean("accountServiceBean"); 
    // 第一次查询，应该走数据库
    System.out.print("first query..."); 
    s.getAccountByName("somebody"); 
    // 第二次查询，应该不查数据库，直接返回缓存的值
    System.out.print("second query..."); 
    s.getAccountByName("somebody"); 
    System.out.println(); 
    
    System.out.println("start testing clear cache...");    // 更新某个记录的缓存，首先构造两个账号记录，然后记录到缓存中
    Account account1 = s.getAccountByName("somebody1");   // 
    Account account2 = s.getAccountByName("somebody2"); 
    // 开始更新其中一个    
    account1.setId(1212);
    s.updateAccountClearCache(account1); 
    s.getAccountByName("somebody1");// 因为被更新了，所以会查询数据库    
    s.getAccountByName("somebody2");// 没有更新过，应该走缓存    
    s.getAccountByName("somebody1");// 再次查询，应该走缓存    // 更新所有缓存
    s.reload(); 
    s.getAccountByName("somebody1");// 应该会查询数据库    
    s.getAccountByName("somebody2");// 应该会查询数据库    
    s.getAccountByName("somebody1");// 应该走缓存    
    s.getAccountByName("somebody2");// 应该走缓存
  } 
	
	@Test
	public void testGetAccountByNameLimit() {
	    ApplicationContext context = new ClassPathXmlApplicationContext( 
	       "classpath:spring/spring-cache-anno.xml");// 加载 spring 配置文件
	    AccountService s = (AccountService) context.getBean("accountServiceBean"); 
	    s.getAccountByName("somebody");// 长度大于 4，不会被缓存
	    s.getAccountByName("sbd");// 长度小于 4，会被缓存
	    s.getAccountByName("somebody");// 还是查询数据库
	    s.getAccountByName("sbd");// 会从缓存返回
	}
	
	@Test
	public void testGetAccount() { 
		ApplicationContext context = new ClassPathXmlApplicationContext( 
	      "classpath:spring/spring-cache-anno.xml");// 加载 spring 配置文件
				  
		AccountService s = (AccountService) context.getBean("accountServiceBean"); 
		s.getAccount("somebody", "123456", true);// 应该查询数据库
		s.getAccount("somebody", "123456", true);// 应该走缓存
		s.getAccount("somebody", "123456", false);// 应该走缓存
		s.getAccount("somebody", "654321", true);// 应该查询数据库
		s.getAccount("somebody", "654321", true);// 应该走缓存
	}
	
	// 根据前面的例子，我们知道，如果使用了 @Cacheable 注释，则当重复使用相同参数调用方法的时候，
	// 方法本身不会被调用执行，即方法本身被略过了，取而代之的是方法的结果直接从缓存中找到并返回了。

	// 现实中并不总是如此，有些情况下我们希望方法一定会被调用，因为其除了返回一个结果，还做了其他事情，
	// 例如记录日志，调用接口等，这个时候，我们可以用 @CachePut 注释，这个注释可以确保方法被执行，
	// 同时方法的返回值也被记录到缓存中。
	@Test
	public void testUpdateAccount() {
		ApplicationContext context = new ClassPathXmlApplicationContext( 
		  "classpath:spring/spring-cache-anno.xml");// 加载 spring 配置文件
				  
		AccountService s = (AccountService) context.getBean("accountServiceBean"); 
				  
		Account account = s.getAccountByName("someone"); 
		  account.setPassword("123"); 
		  s.updateAccount(account); 
		  account.setPassword("321"); 
		  s.updateAccount(account); 
		  account = s.getAccountByName("someone"); 
		  System.out.println(account.getPassword());
	}
}
