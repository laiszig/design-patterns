package com.laiszig.builder.reportBuilder;

/**
 *  The concrete builder classes follow the builder interface and
 *  provide specific implementations of the building steps. Your
 *  program may have several variations of builders, each
 *  implemented differently.
 */
public class ReportBuilder implements Builder {

    private Report report;

    // A fresh builder instance should contain a blank product
    // object which it uses in further assembly.
    public ReportBuilder() {
        this.reset();
    }

    @Override
    // The reset method clears the object being built.
    public void reset() {
        this.report = new Report();
    }

    @Override
    public void setTitle(String title) {
        this.report.setTitle(title);
    }

    @Override
    public void setHeader(String header) {
        this.report.setHeader(header);
    }

    @Override
    public void setContent(String content) {
        this.report.setContent(content);
    }

    @Override
    public void setFooter(String footer) {
        this.report.setFooter(footer);
    }

    /**
     *  Concrete builders are supposed to provide their own
     *  methods for retrieving results. That's because various
     *  types of builders may create entirely different products
     *  that don't all follow the same interface. Therefore, such
     *  methods can't be declared in the builder interface (at
     *  least not in a statically-typed programming language).
     *
     *  Usually, after returning the end result to the client, a
     *  builder instance is expected to be ready to start
     *  producing another product. That's why it's a usual
     *  practice to call the reset method at the end of the
     *  `getProduct` method body. However, this behavior isn't
     *  mandatory, and you can make your builder wait for an
     *  explicit reset call from the client code before disposing
     *  of the previous result.
     * @return
     */
    public Report getProduct() {
        Report product = this.report;
        this.reset();
        return product;
    }
}
