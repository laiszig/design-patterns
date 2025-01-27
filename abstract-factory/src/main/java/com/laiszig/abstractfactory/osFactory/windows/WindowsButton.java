package com.laiszig.abstractfactory.osFactory.windows;

import com.laiszig.abstractfactory.osFactory.Button;

/**
 *  Concrete products are created by corresponding concrete
 *  factories.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
