## Implementing Factory Method pattern

1. **Standardize the Interface:** Ensure all products implement the same interface with methods that apply to every product.

2. **Add a Factory Method:** Include an empty factory method in the creator class. The method’s return type should match the product interface.

3. **Replace Constructors:** Find all instances where product constructors are used. Replace them with calls to the factory method, moving the creation logic into the factory method.

4. **Use Parameters (if needed):** If multiple product types exist, temporarily add a parameter to the factory method to decide which product to create.

5. **Handle Initial Complexity:** Initially, the factory method might be messy, potentially relying on a large switch statement for product selection. This will be addressed later.

6. **Create Subclasses:** For each product type, create a subclass of the creator class. Override the factory method in each subclass, moving specific product creation logic from the base class to the subclass.

7. **Simplify When Needed:** If there are too many product types, consider using a control parameter in the base or subclass factory methods instead of creating numerous subclasses.

8. **Finalize the Base Method:** Once the creation logic is fully extracted:
   - If the base factory method has no remaining logic, make it abstract.
   - Otherwise, retain it as a default implementation.