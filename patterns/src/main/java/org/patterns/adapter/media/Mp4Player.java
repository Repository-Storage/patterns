package org.patterns.adapter.media;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/7/15
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
