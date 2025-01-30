package com.laiszig.prototype.treePrototype;

public class PineTree extends Tree{

    public PineTree(double mass, double height) {
        super(mass, height);
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }
}
