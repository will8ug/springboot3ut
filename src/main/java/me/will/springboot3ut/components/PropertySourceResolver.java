package me.will.springboot3ut.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceResolver {
    @Value("${components.firstProperty}")
    private String firstProperty;

    @Value("${components.secondProperty}")
    private String secondProperty;

    private String thirdProperty = "DefaultValue";

    public String getFirstProperty() {
        return firstProperty;
    }

    public String getSecondProperty() {
        return secondProperty;
    }

    public String getThirdProperty() {
        return thirdProperty;
    }
}
