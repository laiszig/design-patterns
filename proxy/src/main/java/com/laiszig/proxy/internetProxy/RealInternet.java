package com.laiszig.proxy.internetProxy;

public class RealInternet implements Internet{

    @Override
    public void connectTo(String host) {
        System.out.println("Successfully opened connection to " + host);
    }
}
