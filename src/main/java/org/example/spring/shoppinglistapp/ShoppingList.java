package org.example.spring.shoppinglistapp;

import java.util.HashMap;
import java.util.Map;

//import static org.example.spring.shoppinglistapp.Item.*;

public class ShoppingList {

    private Map<Item, Integer> shoppingCart;

    public ShoppingList() {
        this.shoppingCart = new HashMap<>();
        // Options to initialize with default items like below
//        shoppingCart.put(banana, 0);
//        shoppingCart.put(cake, 1);
    }

    public void addItem(Item item) {
        shoppingCart.merge(item, 1, Integer::sum);
    }

    public void removeItem(Item item) {
        shoppingCart.computeIfPresent(item, (key, count) -> {
            int newCount = count - 1;
            return (newCount > 0) ? newCount : null;
        });
    }

    public void viewItems() {
        for (Map.Entry<Item, Integer> entry : shoppingCart.entrySet()) {
            Item item = entry.getKey();
            int count = entry.getValue();
            System.out.println(item + ": " + count);
        }
    }

}
