package org.patterns.prototype.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/20/15
 * Time: 5:38 PM
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside: " + getId() +" draw method");
    }
}
