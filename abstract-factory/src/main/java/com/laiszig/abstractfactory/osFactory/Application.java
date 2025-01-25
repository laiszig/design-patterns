package com.laiszig.abstractfactory.osFactory;

import com.laiszig.abstractfactory.osFactory.uifactory.UIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
