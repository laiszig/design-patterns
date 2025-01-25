package com.laiszig.factory.buttonFactory;

/**
 * The product interface declares the operations that all
 * concrete products must implement.
*/
public interface Button {
    void render(); // Render the button
    void onClick(Runnable action); // Bind a click event
}
