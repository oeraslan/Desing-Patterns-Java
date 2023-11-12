package structural.bridge.musicPlayer;

import structural.bridge.Song;

public class Spotify implements PlayerApp {
    @Override
    public String playMusic(Song song) {
        System.out.println("Spotify music playing " + song);
        return song.getSound();
    }
}
