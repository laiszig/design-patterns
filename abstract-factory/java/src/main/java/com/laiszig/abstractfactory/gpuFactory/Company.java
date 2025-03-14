package com.laiszig.abstractfactory.gpuFactory;

/**
 * If we added more components, we would have to open the methods and change them
 * Violating the OCP.
 * We would need to make the GPU class more generic, like component. And modify the
 * manufacturer classes.
 * It this case, a single factory is not enough.
 *
 * Instead, we could use Abstract Factory. And explicitly declare interfaces for each
 * distinct product we have.
 * Create another factory method inside the abstract class
 * Decoupling the creation of components from the code that is actually using it.
 *
 */
public abstract class Company {

    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
