package org.patterns.abstractfactory.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/5/15
 * Time: 7:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //deal with shapes
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape firstCircle = shapeFactory.getShape("CIRCLE");
        firstCircle.draw();

        Shape firstRectangle = shapeFactory.getShape("RECTANGLE");
        firstRectangle.draw();

        Shape firstSquare = shapeFactory.getShape("SQUARE");
        firstSquare.draw();

        //deal with colors
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color redColor = colorFactory.getColor("RED");
        redColor.fill();

        Color greenColor = colorFactory.getColor("GREEN");
        greenColor.fill();

        Color blueColor = colorFactory.getColor("BLUE");
        blueColor.fill();
    }
}
