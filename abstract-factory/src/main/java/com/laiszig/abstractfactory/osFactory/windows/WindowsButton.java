package com.laiszig.abstractfactory.osFactory.windows;

import com.laiszig.abstractfactory.osFactory.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
