package org.patterns.factory.method.shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Oleg_Kariakin
 * Date: 4/21/15
 * Time: 12:13 PM
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        ShapeFactory factoryMethod = new ShapeFactory();

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(factoryMethod.getShape("CIRCLE"));
        shapes.add(factoryMethod.getShape("RECTANGLE"));
        shapes.add(factoryMethod.getShape("SQUARE"));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
