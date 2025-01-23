package com.laiszig.solidprinciples.openClose.good;

/**
 * This is a better approach. If we have new operations,
 * we can just create another class that implements this interface
 * without changing the code of the Calculator.
 */
public interface Operation {

    int perform(int number1, int number2);
}
