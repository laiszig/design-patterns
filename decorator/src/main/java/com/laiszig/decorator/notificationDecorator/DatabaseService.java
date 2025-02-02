package com.laiszig.decorator.notificationDecorator;

public class DatabaseService {
    public String getMailFromUsername(String username) {
        return username + "@Mail.com";
    }

    public String getPhoneFromUsername(String username) {
        return username + " Phone";
    }

    public String getFBFromUsername(String username) {
        return username + " Facebook";
    }
}
