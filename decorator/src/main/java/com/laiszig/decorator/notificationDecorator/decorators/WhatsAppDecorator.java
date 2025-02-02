package com.laiszig.decorator.notificationDecorator.decorators;

import com.laiszig.decorator.notificationDecorator.INotifier;

public class WhatsAppDecorator extends BaseNotifierDecorator{

    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNbr = databaseService.getPhoneFromUsername(getUsername());
        System.out.println("Sending " + msg + " by WhatsApp on " + phoneNbr);
    }
}
