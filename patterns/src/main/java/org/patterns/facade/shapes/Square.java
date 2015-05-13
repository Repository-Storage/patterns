package org.patterns.facade.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/13/15
 * Time: 6:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
