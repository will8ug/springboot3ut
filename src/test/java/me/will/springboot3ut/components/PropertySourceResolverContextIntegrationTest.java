package me.will.springboot3ut.components;

import me.will.springboot3ut.components.helpers.PropertyOverrideContextInitializer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(
        initializers = PropertyOverrideContextInitializer.class,
        classes = ComponentsApplication.class
)
public class PropertySourceResolverContextIntegrationTest {
    @Autowired
    private PropertySourceResolver propertySourceResolver;

    @Test
    public void shouldContext_overridePropertyValues() {
        String firstProperty = propertySourceResolver.getFirstProperty();
        String secondProperty = propertySourceResolver.getSecondProperty();

        assertEquals(PropertyOverrideContextInitializer.PROPERTY_FIRST_VALUE, firstProperty);
        assertEquals("contextOverrideFile", secondProperty);
    }
}
