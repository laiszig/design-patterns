package com.laiszig.abstractfactory.osFactory.mac;

import com.laiszig.abstractfactory.osFactory.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
