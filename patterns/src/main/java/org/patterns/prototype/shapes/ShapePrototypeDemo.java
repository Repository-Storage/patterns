package org.patterns.prototype.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 4/20/15
 * Time: 6:06 PM
 */
public class ShapePrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneShape.getType());

        Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + cloneShape2.getType());

        Shape cloneShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + cloneShape3.getType());
    }

}
