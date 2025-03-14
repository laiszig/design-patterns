package com.laiszig.abstractfactory.osFactory.uifactory;

import com.laiszig.abstractfactory.osFactory.Button;
import com.laiszig.abstractfactory.osFactory.Checkbox;
import com.laiszig.abstractfactory.osFactory.windows.WindowsButton;
import com.laiszig.abstractfactory.osFactory.windows.WindowsCheckbox;

/**
 *  Concrete factories produce a family of products that belong
 *  to a single variant. The factory guarantees that the
 *  resulting products are compatible. Signatures of the concrete
 *  factory's methods return an abstract product, while inside
 *  the method a concrete product is instantiated.
 */
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
