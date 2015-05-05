package org.patterns.builder.food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 6:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }

}
