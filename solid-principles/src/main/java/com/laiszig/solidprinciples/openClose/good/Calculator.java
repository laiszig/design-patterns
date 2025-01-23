package com.laiszig.solidprinciples.openClose.good;

/**
 * No modifications are needed in our Calculator functionality.
 * We can keep adding extensions by creating new operations/classes.
 */
public class Calculator {

    public int calculateNumber(int number1, int number2, Operation operation) {
        return operation.perform(number1, number2);
    }
}
