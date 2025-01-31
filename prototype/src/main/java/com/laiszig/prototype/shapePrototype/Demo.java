package com.laiszig.prototype.shapePrototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        // The `anotherCircle` variable contains an exact copy
        // of the `circle` object.
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    /**
     * Prototype rocks because it lets you produce a
     * copy of an object without knowing anything about its type.
     */
    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        /**
         *  For instance, we don't know the exact elements in the
         *  shapes array. All we know is that they are all
         *  shapes. But thanks to polymorphism, when we call the
         *  clone` method on a shape the program checks its real
         *  class and runs the appropriate clone method defined
         *  in that class. That's why we get proper clones
         *  instead of a set of simple Shape objects.
         */
        for (int i = 0; i < shapes.size(); i++) {
            // The `shapesCopy` array contains exact copies of the
            // `shape` array's children.
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
