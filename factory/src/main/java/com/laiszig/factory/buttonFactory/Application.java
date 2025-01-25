package com.laiszig.factory.buttonFactory;

public class Application {

    private Dialog dialog;

    // The application picks a creator's type depending on the current configuration or environment settings.
    public void initialize(String os) {
        if ("Windows".equalsIgnoreCase(os)) {
            dialog = new WindowsDialog();
        } else if ("Web".equalsIgnoreCase(os)) {
            dialog = new WebDialog();
        } else {
            throw new IllegalArgumentException("Error! Unknown operating system.");
        }
    }

    // The client code works with an instance of a concrete creator via its base interface.
    public void main(String os) {
        this.initialize(os);
        dialog.render();
    }
}
