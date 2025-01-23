package com.laiszig.solidprinciples.dependencyInversion.good;

/**
 * Both modules are dependent only on abstractions.
 * This low-level module is dependent on CalculatorOperation rather than the add or subtract operations.
 */
public class Calculator {

    public int calculateNumber(int number1, int number2, Operation operation) {
        return operation.perform(number1, number2);
    }
}
