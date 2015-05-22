package org.patterns.proxy.images;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/22/15
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void dispay() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading... " + filename);
    }

}
