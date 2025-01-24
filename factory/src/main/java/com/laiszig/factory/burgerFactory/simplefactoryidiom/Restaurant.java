package com.laiszig.factory.burgerFactory.simplefactoryidiom;

public class Restaurant {

    /**
     * This method, implemented this way, can only return a single type of burger
     */
//    public ???? orderBurger(String request){
//        if("BEEF".equals(request)) {
//            BeefBurger burger = new BeefBurger();
//            burger.prepare();
//            return burger;
//        } else if ("VEGGIE".equals(request)) {
//            VeggieBurger burger = new VeggieBurger();
//            burger.prepare();
//            return burger;
//        }
//    }

    // Still, if things change, we would have to open this code and modify it
    // Violates OCP an SRP
//    public Burger orderBurger(String request){
//        if("BEEF".equals(request)) {
//            BeefBurger burger = new BeefBurger();
//            burger.prepare();
//            return burger;
//        } else if ("VEGGIE".equals(request)) {
//            VeggieBurger burger = new VeggieBurger();
//            burger.prepare();
//        }
//        return burger;
//    }

    public Burger orderBurger(String request) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;
    }
}
