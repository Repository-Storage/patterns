package org.patterns.abstractfactory.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 7:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
