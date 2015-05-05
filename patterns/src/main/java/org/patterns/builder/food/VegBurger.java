package org.patterns.builder.food;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 0.25f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
