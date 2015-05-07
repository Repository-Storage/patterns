package org.patterns.adapter.media;

/**
 * Created with IntelliJ IDEA.
 * User: Oleg_Kariakin
 * Date: 5/7/15
 * Time: 11:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file. Name: " + fileName);
        }

        //media adapter is providing support to play other formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
