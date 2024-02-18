package me.will.springboot3ut.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello(String name) {
        if (!StringUtils.hasLength(name)) {
            return "Hey there!";
        }
        return "Hello " + name + "!";
    }
}
