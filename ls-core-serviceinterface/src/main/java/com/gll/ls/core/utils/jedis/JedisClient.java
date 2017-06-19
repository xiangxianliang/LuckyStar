package com.gll.ls.core.utils.jedis;

/**
 * jedis 操作
 * JedisClient.java
 * 
 * @author xxlsg
 * @Date 2017年6月7日 下午5:02:54
 * @Version 1.0
 */
public interface JedisClient {

	public String set(String key, String value);

	public String get(String key);

	public Boolean exists(String key);

	public Long expire(String key, int seconds);

	public Long ttl(String key);

	public Long incr(String key);

	public Long hset(String key, String field, String value);

	public String hget(String key, String field);

	public Long hdel(String key, String... field);
}
