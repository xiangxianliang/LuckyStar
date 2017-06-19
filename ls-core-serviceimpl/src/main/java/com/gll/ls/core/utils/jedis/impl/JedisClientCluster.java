package com.gll.ls.core.utils.jedis.impl;

import javax.annotation.Resource;

import com.gll.ls.core.utils.jedis.JedisClient;

import redis.clients.jedis.JedisCluster;

/**
 * redis集群
 * JedisClientCluster.java
 * 
 * @author xxlsg
 * @Date 2017年6月7日 下午5:13:53
 * @Version 1.0
 */
public class JedisClientCluster implements JedisClient {

	@Resource
	private JedisCluster jedisCluster;

	@Override
	public String set(String key, String value) {
		return jedisCluster.set(key, value);
	}

	@Override
	public String get(String key) {
		return jedisCluster.get(key);
	}

	@Override
	public Boolean exists(String key) {
		return jedisCluster.exists(key);
	}

	@Override
	public Long expire(String key, int seconds) {
		return jedisCluster.expire(key, seconds);
	}

	@Override
	public Long ttl(String key) {
		return jedisCluster.ttl(key);
	}

	@Override
	public Long incr(String key) {
		return jedisCluster.incr(key);
	}

	@Override
	public Long hset(String key, String field, String value) {
		return jedisCluster.hset(key, field, value);
	}

	@Override
	public String hget(String key, String field) {
		return jedisCluster.hget(key, field);
	}

	@Override
	public Long hdel(String key, String... field) {
		return jedisCluster.hdel(key, field);
	}

}
