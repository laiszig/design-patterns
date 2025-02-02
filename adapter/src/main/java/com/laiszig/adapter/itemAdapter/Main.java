package com.laiszig.adapter.itemAdapter;

import com.laiszig.adapter.itemAdapter.adapters.GroceryItemAdapter;
import com.laiszig.adapter.itemAdapter.item.FoodItem;
import com.laiszig.adapter.itemAdapter.item.GroceryProduct;

/**
 * The Adapter is a structural pattern because it deals with how classes are interacting.
 * It is used to adapt two different incompatible systems.
 *
 * It acts as a connector between our system and some third party or legacy system.
 * For instance, data format incompatibility (XML <-> JSON)
 * Adapter pattern can be achieved in two ways :
 * 1. Class Level: adapting something you are extending and using inheritance.
 * 2. Object level : keeping has-a relationship with class rather than allowing tight coupling.
 *
 * Java example: Arrays.asList(), InputStreamReader, OutputStreamWriter
 *
 */
public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItems(new FoodItem());
        swiggyStore.addItems(new FoodItem());
        //Adapter grocery which was incompatible with food.
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));
    }
}
