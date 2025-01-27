package com.laiszig.abstractfactory.furnitureFactory.victorian;

import com.laiszig.abstractfactory.furnitureFactory.Chair;
import com.laiszig.abstractfactory.furnitureFactory.CoffeeTable;
import com.laiszig.abstractfactory.furnitureFactory.FurnitureFactory;
import com.laiszig.abstractfactory.furnitureFactory.Sofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChar() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
