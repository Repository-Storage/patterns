package org.patterns.facade.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 5/13/15
 * Time: 6:22 PM
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
