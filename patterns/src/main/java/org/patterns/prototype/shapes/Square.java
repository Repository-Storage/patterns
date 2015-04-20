package org.patterns.prototype.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/20/15
 * Time: 5:06 PM
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside " + getType() + " draw method.");
    }

}
