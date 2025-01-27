package com.laiszig.abstractfactory.osFactory.uifactory;

import com.laiszig.abstractfactory.osFactory.Button;
import com.laiszig.abstractfactory.osFactory.Checkbox;
import com.laiszig.abstractfactory.osFactory.mac.MacButton;
import com.laiszig.abstractfactory.osFactory.mac.MacCheckbox;

/**
 * Each concrete factory has a corresponding product variant.
 */
public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
