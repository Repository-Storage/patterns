package org.patterns.flyweight.shapes;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/22/15
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
