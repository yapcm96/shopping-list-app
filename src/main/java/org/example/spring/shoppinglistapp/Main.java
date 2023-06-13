package org.example.spring.shoppinglistapp;

//import org.example.spring.shoppinglistapp.ShoppingList;
//import org.example.spring.shoppinglistapp.ShoppingOperationService;

import static org.example.spring.shoppinglistapp.Item.apple;
import static org.example.spring.shoppinglistapp.Item.banana;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//  Ideally I should be using the service class e.g.
//        var shoppingOperationService = new ShoppingOperationService();
//        var shoppingList = new ShoppingList(shoppingOperationService);


        var shoppingList = new ShoppingList();

        shoppingList.addItem(banana);
        shoppingList.addItem(banana);
        shoppingList.addItem(apple);
        shoppingList.removeItem(banana);

        shoppingList.viewItems();

//        TODO: need to implement CLI interface for user input instead of doing it in the code

        System.out.println("Done!");
    }
}