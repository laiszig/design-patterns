package com.laiszig.abstractfactory.furnitureFactory.modern;

import com.laiszig.abstractfactory.furnitureFactory.Chair;
import com.laiszig.abstractfactory.furnitureFactory.CoffeeTable;
import com.laiszig.abstractfactory.furnitureFactory.FurnitureFactory;
import com.laiszig.abstractfactory.furnitureFactory.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChar() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
