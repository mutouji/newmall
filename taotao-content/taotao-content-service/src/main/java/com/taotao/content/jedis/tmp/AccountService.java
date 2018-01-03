package com.taotao.content.jedis.tmp;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public class AccountService {
	
  @Cacheable(value="accountCache")// 使用了一个缓存名叫 accountCache 
  public Account getAccountByName(String userName) { 
    // 方法内部实现不考虑缓存逻辑，直接实现业务
    System.out.println("real query account."+userName); 
    return getFromDB(userName); 
  } 
  
  @Cacheable(value="accountCache",condition="#userName.length() <= 4")// 缓存名叫 accountCache 
  public Account getAccountByNameLimit(String userName) { 
	  // 方法内部实现不考虑缓存逻辑，直接实现业务
	  return getFromDB(userName); 
  }
  
  @Cacheable(value="accountCache",key="#userName.concat(#password)")
  public Account getAccount(String userName, String password, boolean sendLog) {
	  return getFromDB(userName, password);
  }
  
  @CacheEvict(value="accountCache",key="#account.getName()")// 清空 accountCache 缓存  
  public void updateAccountClearCache(Account account) {
    updateDB(account); 
  } 
  @CachePut(value="accountCache",key="#account.getName()")// 更新 accountCache 缓存
  public Account updateAccount(Account account) { 
    return updateDB1(account); 
  } 
  
  @CacheEvict(value="accountCache",allEntries=true)// 清空 accountCache 缓存
  public void reload() { 
  } 
  
  private Account getFromDB(String acctName) { 
    System.out.println("real querying db..."+acctName); 
    return new Account(acctName); 
  } 
  private Account getFromDB(String acctName, String password) { 
	    System.out.println("real querying db...userName=" + acctName + " password=" + password); 
	    return new Account(acctName); 
  } 

  private void updateDB(Account account) { 
    System.out.println("real update db..."+account.getName()); 
  } 
  
  private Account updateDB1(Account account) { 
	  System.out.println("real updating db..."+account.getName()); 
	  return account; 
  } 
}
