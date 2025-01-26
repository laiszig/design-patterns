package com.laiszig.abstractfactory.gpuFactory.asus;

import com.laiszig.abstractfactory.gpuFactory.Company;
import com.laiszig.abstractfactory.gpuFactory.Gpu;
import com.laiszig.abstractfactory.gpuFactory.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
