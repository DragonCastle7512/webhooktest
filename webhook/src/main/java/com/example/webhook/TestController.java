package com.example.webhook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
    @GetMapping("test")
    public String test() {
        return "웹훅 테스트";
    }
    @GetMapping("trigger")
    public String trigger() {
        System.out.println("webhook test");
        return "webhook test";
    }
    
}
