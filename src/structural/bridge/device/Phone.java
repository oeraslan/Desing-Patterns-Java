package structural.bridge.device;

import structural.bridge.Song;
import structural.bridge.audioOutput.Jack;
import structural.bridge.musicPlayer.PlayerApp;

public class Phone extends Computer {
    public Phone(Jack jack, PlayerApp player) {
        super(jack, player);
    }

    @Override
    public void playMusic(Song song) {
        System.out.println("Phone play music...");
        super.playMusic(song);
    }
}
