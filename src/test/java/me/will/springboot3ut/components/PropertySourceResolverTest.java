package me.will.springboot3ut.components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PropertySourceResolverTest {
    @Autowired
    private PropertySourceResolver propertySourceResolver;

    @Test
    void testProperties_InjectedFromTestDefaultResources() {
        assertEquals("fromTestDefault-firstProperty", propertySourceResolver.getFirstProperty());
        assertEquals("fromTestDefault-secondProperty", propertySourceResolver.getSecondProperty());
    }
}