package com.laiszig.solidprinciples.dependencyInversion.good;

/**
 * The low-level modules implementing this interface have to go through here.
 * By using abstraction, the high and low level modules are loosely coupled.
 */
public interface Operation {

    int perform(int number1, int number2);
}
