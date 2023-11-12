package structural.bridge.device;

import structural.bridge.Song;
import structural.bridge.audioOutput.Jack;
import structural.bridge.musicPlayer.PlayerApp;

public abstract class Computer {
    private Jack jack;
    private PlayerApp player;

    public Computer(Jack jack, PlayerApp player) {
        this.jack = jack;
        this.player = player;
    }

    public Computer() {
    }

    public void playMusic(Song song) {
        String sound = player.playMusic(song);
        jack.getSound(sound);
    }
}
