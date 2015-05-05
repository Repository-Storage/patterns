package org.patterns.abstractfactory.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
