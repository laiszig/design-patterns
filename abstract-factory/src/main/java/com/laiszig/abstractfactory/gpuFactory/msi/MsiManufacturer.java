package com.laiszig.abstractfactory.gpuFactory.msi;

import com.laiszig.abstractfactory.gpuFactory.Company;
import com.laiszig.abstractfactory.gpuFactory.Gpu;
import com.laiszig.abstractfactory.gpuFactory.Monitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
