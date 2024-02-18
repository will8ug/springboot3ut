package me.will.springboot3ut;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringbootutApplicationTests {

    @SuppressWarnings("ObviousNullCheck")
    @Test
    void contextLoads() {
        assertNotNull("Expect Sprint Boot is started");
    }

}
