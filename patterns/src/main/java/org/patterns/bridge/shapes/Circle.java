package org.patterns.bridge.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/8/15
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape {

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
