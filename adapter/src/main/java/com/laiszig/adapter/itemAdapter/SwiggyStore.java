package com.laiszig.adapter.itemAdapter;

import com.laiszig.adapter.itemAdapter.item.Item;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
    List<Item> items = new ArrayList<>();
    public void addItems(Item item) {
        items.add(item);
    }
}
