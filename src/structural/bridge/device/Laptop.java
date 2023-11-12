package structural.bridge.device;

import structural.bridge.Song;
import structural.bridge.audioOutput.Jack;
import structural.bridge.musicPlayer.PlayerApp;

public class Laptop extends Computer {

    public Laptop(Jack jack, PlayerApp player) {
        super(jack, player);
    }

    @Override
    public void playMusic(Song song) {
        System.out.println("Laptop play music...");
        super.playMusic(song);
    }

}
