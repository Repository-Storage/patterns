package org.patterns.adapter.media;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/7/15
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.flc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
