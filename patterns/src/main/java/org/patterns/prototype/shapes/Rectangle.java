package org.patterns.prototype.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/20/15
 * Time: 5:04 PM
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside: " + getType() + " draw method.");
    }
}
