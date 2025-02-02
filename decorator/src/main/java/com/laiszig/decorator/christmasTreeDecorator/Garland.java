package com.laiszig.decorator.christmasTreeDecorator;

/**
 * We’ll now create some decorating element.
 * These decorators will extend our abstract TreeDecorator class and will modify its decorate() method according to our requirement.
 */
public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Garland";
    }
}
