package com.laiszig.factory.buttonFactory;

public class ButtonExampleMain {

    public static void main(String[] args) {
        Application app = new Application();

        // Pass "Windows" or "Web" based on the environment
        app.main("Windows"); // Change this to "Web" to use WebDialog
    }
}
