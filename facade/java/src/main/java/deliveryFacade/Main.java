package deliveryFacade;

/**
 * Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
 * It allows the client to call a single entry point to that function.
 * We should use facade pattern when we have complex subsystems, and calling it is resumed to a single operation for client.
 * Facade pattern basically adds one level of abstractions in the system.
 *
 * To implement facade we just need to write one class which interacts with other services downstream.
 *
 * Implementation:
 * 1. The Facade provides access to a particular part of the subsystem's functionality.
 * 2. An Additional Facade class can be created to prevent polluting a single facade with unrelated features.
 * 3. The Complex Subsystem consists of various objects. These objects can be accessed from the Facade.
 * 4. The Client uses the facade instead of calling the subsystem directly.
 *
 */
public class Main {
    public static void main(String[] args) {
        DeliveryAppFacade deliveryAppFacade = new DeliveryAppFacade();
        deliveryAppFacade.placeOrder();
    }
}
