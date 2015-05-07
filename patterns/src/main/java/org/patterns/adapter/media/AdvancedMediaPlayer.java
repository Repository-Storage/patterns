package org.patterns.adapter.media;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/7/15
 * Time: 11:29 AM
 * To change this template use File | Settings | File Templates.
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
