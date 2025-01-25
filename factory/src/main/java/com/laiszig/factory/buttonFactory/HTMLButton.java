package com.laiszig.factory.buttonFactory;

/**
 * Concrete products provide various implementations of the
 * product interface.
 */
public class HTMLButton implements Button {

    @Override
    public void render() {
        // Return an HTML representation of a button.
        System.out.println("Rendering HTML button.");
    }

    @Override
    public void onClick(Runnable action) {
        // Bind a web browser click event.
        System.out.println("HTML button clicked.");
        action.run();
    }
}
