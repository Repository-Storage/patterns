package org.patterns.facade.shapes;

/**
 * User: Oleg_Kariakin
 * Date: 5/13/15
 * Time: 6:27 PM
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        //or facaded
        shapeMaker.drawAllShapes();
    }
}
