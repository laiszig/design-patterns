package com.laiszig.builder.reportBuilder;

/**
 *  The director is only responsible for executing the building
 *  steps in a particular sequence. It's helpful when producing
 *  products according to a specific order or configuration.
 *  Strictly speaking, the director class is optional, since the
 *  client can control builders directly.
 */
public class Director {

    /**
     *  The director works with any builder instance that the
     *  client code passes to it. This way, the client code may
     *  alter the final type of the newly assembled product.
     *  The director can construct several product variations
     *  using the same building steps.
     * @param builder
     */
    public void constructMonthlyReport(Builder builder) {
        builder.reset();
        builder.setTitle("Monthly Sales Report");
        builder.setHeader("Sales Performance - January");
        builder.setContent("This month's performance showed a 5% increase in sales.");
        builder.setFooter("Generated on: 29 January 2025");
    }

    public void constructAnnualReport(Builder builder) {
        builder.reset();
        builder.setTitle("Annual Performance Report");
        builder.setHeader("Annual Overview - 2025");
        builder.setContent("The annual performance showed a 10% increase in overall sales.");
        builder.setFooter("Generated on: 31 December 2025");
    }
}
