package org.patterns.factory.method.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/21/15
 * Time: 11:57 AM
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw method");
    }

}
