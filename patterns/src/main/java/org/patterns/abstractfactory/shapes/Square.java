package org.patterns.abstractfactory.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 6:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
