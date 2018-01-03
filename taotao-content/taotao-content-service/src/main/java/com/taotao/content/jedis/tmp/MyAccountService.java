package com.taotao.content.jedis.tmp;

/**
 * 缓存代码和业务代码耦合度太高，如上面的例子，AccountService 中的 getAccountByName（）方法中有了太多缓存的逻辑，不便于维护和变更
不灵活，这种缓存方案不支持按照某种条件的缓存，比如只有某种类型的账号才需要缓存，这种需求会导致代码的变更
缓存的存储这块写的比较死，不能灵活的切换为使用第三方的缓存模块
 * @author mutouji
 *
 */
public class MyAccountService {
  private MyCacheManager<Account> cacheManager; 
  
  public MyAccountService() { 
    cacheManager = new MyCacheManager<Account>();// 构造一个缓存管理器
  } 
  
  public Account getAccountByName(String acctName) { 
    Account result = cacheManager.getValue(acctName);// 首先查询缓存
    if(result!=null) { 
      System.out.println("get from cache..."+acctName); 
      return result;// 如果在缓存中，则直接返回缓存的结果
    } 
    result = getFromDB(acctName);// 否则到数据库中查询
    if(result!=null) {// 将数据库查询的结果更新到缓存中
      cacheManager.addOrUpdateCache(acctName, result); 
    } 
    return result; 
  } 
  
  public void reload() { 
    cacheManager.evictCache(); 
  } 
  
  private Account getFromDB(String acctName) { 
    System.out.println("real querying db..."+acctName); 
    return new Account(acctName); 
  } 
}
