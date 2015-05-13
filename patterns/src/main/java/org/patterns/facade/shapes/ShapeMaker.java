package org.patterns.facade.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 5/13/15
 * Time: 6:25 PM
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawAllShapes() {
        System.out.println("Drawing all shapes");
        drawCircle();
        drawRectangle();
        drawSquare();
    }

}
