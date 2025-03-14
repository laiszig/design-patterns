package videoBridge;

/**
 * Bridge Pattern : Bridge pattern is a structural pattern. Has-a relationship.
 * We create a bridge between two implementations using composition rather than inheritance.
 * While dealing with abstraction we usually create inheritance hierarchies to achieve abstraction.
 * However, inheritance is not always the best option as it creates tightly couple application. One change in the base class
 * can cause issues in the entire hierarchy.
 *
 *
 * When to use:
 * We want a parent abstract class to define the set of basic rules, and the concrete classes to add additional rules.
 * Good for big number of variants
 *
 * When using inheritance, the hierarchy can continue to grow.
 * For example, we have a Shape class, and a Rectangle and Triangle.
 * Each shape has two color variants red and yellow. You need to extended and Created RedRectangleShape and YellowRectangleShape, same for the triangle.
 * Now we 4 different variants of shape. But if we add another color and/or shape (Blue/Circle), we need to continue crating new classes for it.
 *
 * Instead, we can implement the bridge pattern which separates function in different hierarchies, one for color and one for shape.
 * This way, the shape has a color and uses it.
 *
 * Major components to achieve bridge patterns are :
 * 1. Abstraction : Main abstract class used by the client.
 * 2. RefinedAbstraction - Class which extends the abstraction.
 * 3. Implementor : Interface for the implementation hierarchy.
 * 4. Concrete Implementor - Implementation of the implementor.
 */
public class Main {
    public static void main(String[] args) {
        Video primeVideo = new PrimeVideo(new HDProcessor());
        primeVideo.play("abc.mp4");
        Video netflixVideo = new NetflixVideo(new UHD4KProcessor());
        netflixVideo.play("abc.mp4");
    }
}
