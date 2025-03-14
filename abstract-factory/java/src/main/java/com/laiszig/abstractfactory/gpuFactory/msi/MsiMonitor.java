package com.laiszig.abstractfactory.gpuFactory.msi;

import com.laiszig.abstractfactory.gpuFactory.Monitor;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Creating MSI Monitor.");
    }
}
