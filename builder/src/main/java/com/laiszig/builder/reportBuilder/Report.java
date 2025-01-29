package com.laiszig.builder.reportBuilder;

/**
 *  Using the Builder pattern makes sense only when your products
 *  are quite complex and require extensive configuration. The
 *  following two products are related, although they don't have
 *  a common interface.
 */
public class Report {
    private String title;
    private String header;
    private String content;
    private String footer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
