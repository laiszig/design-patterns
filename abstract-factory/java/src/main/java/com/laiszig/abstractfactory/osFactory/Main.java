package com.laiszig.abstractfactory.osFactory;

import com.laiszig.abstractfactory.osFactory.uifactory.WindowsUIFactory;

public class Main {

    public static void main(String[] args) {
        Application application = new Application(new WindowsUIFactory());
        application.paint();
    }
}
