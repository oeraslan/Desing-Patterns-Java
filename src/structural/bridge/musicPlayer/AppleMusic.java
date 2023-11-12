package structural.bridge.musicPlayer;

import structural.bridge.Song;

public class AppleMusic implements PlayerApp {
    @Override
    public String playMusic(Song song) {
        System.out.println("Apple music playing " + song);
        return song.getSound();
    }
}
