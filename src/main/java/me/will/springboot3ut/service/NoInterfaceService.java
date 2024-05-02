package me.will.springboot3ut.service;

import me.will.springboot3ut.components.IrrelevantComponent;
import org.springframework.beans.factory.annotation.Autowired;

public class NoInterfaceService {
    @Autowired
    private IrrelevantComponent irrelevantComponent;

    public boolean isPositive(int num) {
        return num > 0;
    }

    public void doSomethingSafely() {
        irrelevantComponent.doSomethingUnimportant();
    }
}
