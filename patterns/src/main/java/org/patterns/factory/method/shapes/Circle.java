package org.patterns.factory.method.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/21/15
 * Time: 12:01 PM
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw method");
    }

}
