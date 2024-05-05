package me.will.springboot3ut.components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class PropertySourceResolverSpecificProfileTest {
    @Autowired
    private PropertySourceResolver propertySourceResolver;

    @Test
    void testProperties_InjectedFromSpecificTestResources() {
        assertEquals("fromTest-firstProperty", propertySourceResolver.getFirstProperty());
        assertEquals("fromTest-secondProperty", propertySourceResolver.getSecondProperty());
    }
}
