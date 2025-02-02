package com.laiszig.decorator.notificationDecorator;

import com.laiszig.decorator.notificationDecorator.decorators.FacebookDecorator;
import com.laiszig.decorator.notificationDecorator.decorators.WhatsAppDecorator;

public class Main {

    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("laiszig")));
        notifyAll.send("Notification: Your package has arrived!!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("laiszig"));
        notifyFbMail.send("Notification: Your package was delivered!!!");

    }
}
