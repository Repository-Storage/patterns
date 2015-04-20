package org.patterns.prototype.shapes;

import java.util.Hashtable;

/**
 * User: Oleg_Kariakin
 * Date: 4/20/15
 * Time: 5:44 PM
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /*
    for each shape run database query and created shapes
    shapeMap.put(shapeKey, shape);
    for example we're adding three shapes
    * */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }


}
