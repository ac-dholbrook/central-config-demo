package com.example.alpha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${message.greeting:Not Supplied}")
    private String greeting;

    @RequestMapping("/")
    public String index() {
        return greeting;
    }
}
