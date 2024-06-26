package me.will.springboot3ut.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class HelloServiceImplTest {
    @Autowired
    private IHelloService helloService;

    @Test
    void testHello_EmptyParameters() {
        assertEquals("Hey there!", helloService.hello(null));
        assertEquals("Hey there!", helloService.hello(""));
    }

    @Test
    void testHello_NonEmptyParameters() {
        assertEquals("Hello Pam!", helloService.hello("Pam"));
    }
}