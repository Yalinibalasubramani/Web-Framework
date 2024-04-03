package com.project1.project1.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String yaal()
    {
        return "Hi...I am Yalini";
    }
}
