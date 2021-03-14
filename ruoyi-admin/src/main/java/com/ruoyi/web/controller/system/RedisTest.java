package com.ruoyi.web.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试redis连接
 */
@RestController
public class RedisTest {
    @Autowired
    public StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "/")
    public String getIndex(){
        stringRedisTemplate.opsForValue().set("userName", "Enhiles");
        System.out.println(stringRedisTemplate.opsForValue().get("userName"));
        return "";
    }
    public static void main(String [] args){
       RedisTest r = new RedisTest();
       r.getIndex();
    }
}
