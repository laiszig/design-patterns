package com.laiszig.abstractfactory.gpuFactory.asus;

import com.laiszig.abstractfactory.gpuFactory.Monitor;

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Creating Asus Monitor.");
    }
}
