package com.laiszig.abstractfactory.osFactory.uifactory;

import com.laiszig.abstractfactory.osFactory.Button;
import com.laiszig.abstractfactory.osFactory.Checkbox;
import com.laiszig.abstractfactory.osFactory.windows.WindowsButton;
import com.laiszig.abstractfactory.osFactory.windows.WindowsCheckbox;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
