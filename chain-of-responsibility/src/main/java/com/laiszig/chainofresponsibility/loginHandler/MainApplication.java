package com.laiszig.chainofresponsibility.loginHandler;

import com.laiszig.chainofresponsibility.loginHandler.handlers.Handler;
import com.laiszig.chainofresponsibility.loginHandler.handlers.RoleCheckHandler;
import com.laiszig.chainofresponsibility.loginHandler.handlers.UserExistsHandler;
import com.laiszig.chainofresponsibility.loginHandler.handlers.ValidPasswordHandler;

public class MainApplication {
    public static void main(String[] args) throws InterruptedException {

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));
        Thread.sleep(3000);

        System.out.println("==========================================");


        System.out.println(service.logIn("user_username", "password"));
        Thread.sleep(3000);

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));
        Thread.sleep(3000);

        System.out.println("==========================================");

    }
}
