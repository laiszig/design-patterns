package com.laiszig.abstractfactory.gpuFactory.msi;

import com.laiszig.abstractfactory.gpuFactory.Gpu;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Creating MSI GPU.");
    }
}
