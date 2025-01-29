package com.laiszig.builder.reportBuilder;

public interface Builder {

    void reset();
    void setTitle(String title);
    void setHeader(String header);
    void setContent(String content);
    void setFooter(String footer);
}
