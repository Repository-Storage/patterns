package org.patterns.proxy.images;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/22/15
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.dispay();
        System.out.println("");

        //image will not be loaded from disk
        image.dispay();
    }

}
