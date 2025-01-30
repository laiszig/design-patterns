## Prototype

### When to use Prototype design pattern:
- When the Object creation is a costly affair 
    - and requires a lot of time and resources 
    - and you have a similar object already existing. 

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs.
- Prototype design pattern uses **Java Cloning** to copy the object.

#### Prototype Design Pattern Example - EmployeePrototype

1. We have an Object that loads data from database.
2. We need to modify this data in our program multiple times.
   - Bad: to create the Object using the `new` keyword and load all the data again from the database.
   - Good: Clone the existing object into a new object and then manipulate the data.

- The Object being copied should provide the copying feature.
- Choose between shallow or deep copy of the Object properties.
  - **Shallow copy:** A "shallow copy" only copies the top-level structure of an object, meaning it shares references to nested objects with the original
  - **Deep copy:** A "deep copy" creates a completely new object with independent copies of all nested objects, ensuring no shared references between the original and the copy

