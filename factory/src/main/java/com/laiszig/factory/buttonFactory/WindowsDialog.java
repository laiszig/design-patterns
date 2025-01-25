package com.laiszig.factory.buttonFactory;

/**
 * Concrete creators override the factory method to change the
 * resulting product's type.
 */
public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
