package com.laiszig.factory.buttonFactory;

/**
 * Concrete products provide various implementations of the
 * product interface.
 */
public class WindowsButton implements Button{
    @Override
    public void render() {
        // Render a button in Windows style.
        System.out.println("Rendering Windows button.");
    }

    @Override
    public void onClick(Runnable action) {
        // Bind a native OS click event.
        System.out.println("Windows button clicked.");
        action.run();
    }
}
