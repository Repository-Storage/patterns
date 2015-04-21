package org.patterns.factory.method.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/21/15
 * Time: 11:56 AM
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("In Rectangle::draw method");
    }

}
