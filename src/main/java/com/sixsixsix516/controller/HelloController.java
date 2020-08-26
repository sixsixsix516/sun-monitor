package com.sixsixsix516.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sun 2020/8/26 18:19
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
