package com.laiszig.abstractfactory.osFactory;

import com.laiszig.abstractfactory.osFactory.uifactory.UIFactory;

/**
 *  The client code works with factories and products only
 *  through abstract types: GUIFactory, Button and Checkbox. This
 *  lets you pass any factory or product subclass to the client
 *  code without breaking it.
 */
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
