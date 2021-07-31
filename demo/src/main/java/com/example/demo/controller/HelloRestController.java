package com.example.demo.controller;

import com.example.demo.entity.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Hash;

@RestController
public class HelloRestController {
    @GetMapping<"/hello-object">
    @ResponseBody
    public Hello helloObject(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);

        return map;
    }

    @GetMapping("/hello-map")
    @ResponseBody
    public Map<String, Object> helloMap(String name) {
        Map<String, Object> m = new HashMap<>();
        m.put("name", name);
        return m;
    }

    @GetMapping("/hello-string/a/b")
    @ResponseBody
    public String helloString(String name) {
        return String.format("hello, %s", name);
    }

}
