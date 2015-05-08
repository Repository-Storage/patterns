package org.patterns.bridge.shapes;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/8/15
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
