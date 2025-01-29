package com.laiszig.builder.reportBuilder;

/**
 * The client code creates a builder object, passes it to the
 * director and then initiates the construction process. The end
 * result is retrieved from the builder object.
 */
public class Application {

    public void generateReport() {
        Director director = new Director();

        ReportBuilder reportBuilder = new ReportBuilder();
        director.constructMonthlyReport(reportBuilder);
        Report report = reportBuilder.getProduct();

        // You can similarly construct different types of reports
        // The final product is often retrieved from a builder
        // object since the director isn't aware of and not
        // dependent on concrete builders and products.
    }
}