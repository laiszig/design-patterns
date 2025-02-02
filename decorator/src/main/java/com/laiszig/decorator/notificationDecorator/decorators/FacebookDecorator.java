package com.laiszig.decorator.notificationDecorator.decorators;

import com.laiszig.decorator.notificationDecorator.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg) {
        super.send(msg);
        String fbName = databaseService.getFBFromUsername(getUsername());
        System.out.println("Sending " + msg + " on Facebook to " + fbName);
    }
}
