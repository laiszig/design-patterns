package com.laiszig.abstractfactory.osFactory.windows;

import com.laiszig.abstractfactory.osFactory.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
