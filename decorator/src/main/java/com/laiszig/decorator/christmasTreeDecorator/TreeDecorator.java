package com.laiszig.decorator.christmasTreeDecorator;

/**
 * We’ll now create an abstract TreeDecorator class for this tree.
 * This decorator will implement the ChristmasTree interface as well as hold the same object.
 * The implemented method from the same interface will simply call the decorate() method from our interface:
 */
public abstract class TreeDecorator implements ChristmasTree{

    private ChristmasTree tree;

    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
