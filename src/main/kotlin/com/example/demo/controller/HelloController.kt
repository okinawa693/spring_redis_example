package com.example.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * クラスの説明
 *
 * @param 型引数の説明
 * @constructor コンストラクタの説明
 */
@RestController
class HelloController {

    @RequestMapping("/")
    fun index(): String {
        return "Hello World!"
    }
}