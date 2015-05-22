package org.patterns.proxy.images;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/22/15
 * Time: 7:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void dispay() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.dispay();
    }

}
