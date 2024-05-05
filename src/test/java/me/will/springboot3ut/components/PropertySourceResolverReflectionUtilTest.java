package me.will.springboot3ut.components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PropertySourceResolverReflectionUtilTest {
    @Autowired
    private PropertySourceResolver propertySourceResolver;

    @Test
    public void testProperties_ShouldInjectedByReflectionUtils() {
        ReflectionTestUtils.setField(propertySourceResolver, "thirdProperty", "OverriddenByReflectionUtils");
        assertEquals("OverriddenByReflectionUtils", propertySourceResolver.getThirdProperty());
    }
}
