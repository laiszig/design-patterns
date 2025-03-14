package com.laiszig.abstractfactory.gpuFactory.asus;

import com.laiszig.abstractfactory.gpuFactory.Gpu;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Creating Asus GPU.");
    }
}
