package org.patterns.abstractfactory.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 7:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        throw new UnsupportedOperationException();
    }
}
