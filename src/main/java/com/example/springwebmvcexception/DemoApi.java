package com.example.springwebmvcexception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoApi {

    @GetMapping("/")
    public List<Object> demoService() {
        return Arrays.asList("a", "b", "c");
    }
}
