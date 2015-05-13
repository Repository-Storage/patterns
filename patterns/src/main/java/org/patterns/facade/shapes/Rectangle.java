package org.patterns.facade.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 5/13/15
 * Time: 6:20 PM
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
