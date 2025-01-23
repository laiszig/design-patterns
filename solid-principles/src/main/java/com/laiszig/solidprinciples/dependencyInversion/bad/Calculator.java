package com.laiszig.solidprinciples.dependencyInversion.bad;

/**
 * Parent module or main module of calculator, which uses a specific
 * method depending on the user's choice.
 * This is a violation of Dependency Injection Principle because this high-level module is
 * dependent on a low level module.
 * Both high-level and low-level modules should depend on abstractions.
 * While abstractions should not depend on details, details should depend on abstractions
 */
public class Calculator {
    public int calculate(int a, int b, String operation) {
        int result = 0;

        switch(operation) {
            case "add":
                AddOperation addOperation = new AddOperation();
                result = addOperation.add(a, b);
            case "sub":
                SubOperation subOperation = new SubOperation();
                result = subOperation.sub(a, b);
        }
        return result;
    }
}
