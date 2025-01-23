package com.laiszig.solidprinciples.openClose.bad;

/**
 * This class violates the Open-Close principle
 * Because every new operation has to be added, modifying already existing code
 * We should introduce division
 */
public class BadCalculator {

    public int calculateNumber(int number1, int number2, String type) {
        int result = 0;

        switch (type) {
            case "sum":
                result = number1 + number2;
            case "sub":
                result = number1 - number2;
        }
        return result;
    }

}
