package org.patterns.adapter.media;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/7/15
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException();
    }

}
