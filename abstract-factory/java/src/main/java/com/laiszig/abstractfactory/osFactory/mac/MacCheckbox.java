package com.laiszig.abstractfactory.osFactory.mac;

import com.laiszig.abstractfactory.osFactory.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
