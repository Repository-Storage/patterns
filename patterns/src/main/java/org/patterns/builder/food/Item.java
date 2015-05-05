package org.patterns.builder.food;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 6:23 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
