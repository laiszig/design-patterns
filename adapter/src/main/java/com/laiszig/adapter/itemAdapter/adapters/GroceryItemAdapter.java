package com.laiszig.adapter.itemAdapter.adapters;

import com.laiszig.adapter.itemAdapter.item.GroceryItem;
import com.laiszig.adapter.itemAdapter.item.Item;

/**
 * Adapting groceryItem using an instance
 * of that particular class
 */
public class GroceryItemAdapter implements Item {

    private GroceryItem item;

    public GroceryItemAdapter(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getItemName() {
        return "";
    }

    @Override
    public String getPrice() {
        return "";
    }

    @Override
    public String getRestaurantName() {
        return "";
    }
}
