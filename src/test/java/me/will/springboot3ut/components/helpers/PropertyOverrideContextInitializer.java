package me.will.springboot3ut.components.helpers;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.support.TestPropertySourceUtils;

public class PropertyOverrideContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    public static final String PROPERTY_FIRST_VALUE = "contextClass";

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(applicationContext,
                "components.firstProperty=" + PROPERTY_FIRST_VALUE);

        TestPropertySourceUtils.addPropertiesFilesToEnvironment(applicationContext,
                "classpath:context-override-application.properties");
    }
}
