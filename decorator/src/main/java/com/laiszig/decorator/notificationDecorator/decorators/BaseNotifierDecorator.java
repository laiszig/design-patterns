package com.laiszig.decorator.notificationDecorator.decorators;

import com.laiszig.decorator.notificationDecorator.DatabaseService;
import com.laiszig.decorator.notificationDecorator.INotifier;

public class BaseNotifierDecorator implements INotifier {

    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    @Override
    public void send(String msg) {
        wrapped.send(msg);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
