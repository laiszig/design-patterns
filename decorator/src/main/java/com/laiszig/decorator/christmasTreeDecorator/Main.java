package com.laiszig.decorator.christmasTreeDecorator;

/**
 * Note that in the first tree1 object, we’re only decorating it with only one Garland,
 * while the other tree2 object we’re decorating with one BubbleLights and two Garlands.
 * This pattern gives us this flexibility to add as many decorators as we want at runtime.
 *
 * Use the decorator pattern:
 * When we wish to add, enhance or even remove the behavior or state of objects
 * When we just want to modify the functionality of a single object of class and leave others unchanged
 */
public class Main {
    public static void main(String[] args) {

        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new ChristmasTreeImpl()));
        System.out.println(tree2.decorate());
    }


}
