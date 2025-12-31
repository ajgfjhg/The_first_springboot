package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "🎉 Spring Boot启动成功！这是我的第一个REST接口。";
    }

    @GetMapping("/")
    public String home() {
        return "欢迎访问Spring Boot应用！请尝试访问 /hello 接口。";
    }
}