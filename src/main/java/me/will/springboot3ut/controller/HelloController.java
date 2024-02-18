package me.will.springboot3ut.controller;

import me.will.springboot3ut.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private IHelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return helloService.hello(name);
    }
}
