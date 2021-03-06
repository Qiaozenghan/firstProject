package com.example.demo.test;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * @ClassName TestTest
 * @Description TODO
 * @Author qzh
 * @Date 2022/4/9 13:21
 * @Version 1.0
 **/
@SpringBootTest
public class TestTest {
    private static Jedis jedis = new Jedis("192.168.0.111", 6379);

    @Test
    public void redisString() {
        System.out.println(jedis.set("name1", "zhangsan"));
        System.out.println(jedis.expire("name1", 40));
        System.out.println(jedis.get("name1"));;
        System.out.println(jedis.setnx("name2", "lisi"));
        System.out.println(jedis.setex("name3", 20, "wangwu"));
        System.out.println(jedis.ttl("name3"));
    }

    @Test
    public void redisSet() {
        System.out.println(jedis.sadd("class2", "stu1", "stu2", "stu3"));
        System.out.println(jedis.scard("class1"));
        System.out.println(jedis.smembers("class1"));
    }

    @Test
    public void redisList(){
        System.out.println(jedis.lpush("list2", "a", "b", "c"));
        System.out.println(jedis.lpush("list2", "a", "b", "c"));
        System.out.println(jedis.lrange("list2", 0, -1));
        System.out.println(jedis.llen("list2"));
        System.out. println(jedis.lrem("list2", 1, "a"));
        System.out.println(jedis.lrange("list2", 0, -1));

    }

    @Test
    public void redisHash(){
        //hset 和hmset作用以一样，但是redis4.0.0 放弃了hmset 使用hset
        System.out.println(jedis.set("a", "aa"));
        long begin = System.currentTimeMillis();
        for(int i = 0; i < 500; i++){
            Map<String, String> map = new HashMap<>();
            map.put("name", i+"");
            map.put("sex", i+"");
            jedis.hset(i+"", map);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin+"===");

    }

    @Test
    public void test1(){

    }
}