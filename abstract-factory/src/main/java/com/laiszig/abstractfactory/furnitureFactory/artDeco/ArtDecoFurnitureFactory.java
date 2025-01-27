package com.laiszig.abstractfactory.furnitureFactory.artDeco;

import com.laiszig.abstractfactory.furnitureFactory.Chair;
import com.laiszig.abstractfactory.furnitureFactory.CoffeeTable;
import com.laiszig.abstractfactory.furnitureFactory.FurnitureFactory;
import com.laiszig.abstractfactory.furnitureFactory.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChar() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
