package com.example.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Duration

/**
 * クラスの説明
 *
 * @param 型引数の説明
 * @constructor コンストラクタの説明
 */
@RestController
class HelloController {

    @Autowired
    lateinit var redisTemplate: StringRedisTemplate

    @RequestMapping("/")
    fun index(): String {
        // val timeout = Duration.ofHours(1)
        // redisTemplate.opsForValue().set("hello", "XXXXXXX", timeout)
        return "Hello World!"
    }
}
