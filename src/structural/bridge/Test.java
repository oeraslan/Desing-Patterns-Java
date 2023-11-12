package structural.bridge;

import structural.bridge.audioOutput.HeadPhone;
import structural.bridge.audioOutput.Jack;
import structural.bridge.audioOutput.Speaker;
import structural.bridge.device.Computer;
import structural.bridge.device.Laptop;
import structural.bridge.device.Phone;
import structural.bridge.musicPlayer.AppleMusic;
import structural.bridge.musicPlayer.PlayerApp;
import structural.bridge.musicPlayer.Spotify;

public class Test {

    public static void main(String[] Args){
        Song song = new Song("Eminem - Mockingbird", "Yeah\n" +
                "I know sometimes\n" +
                "Things may not always make sense to you right now");

        Jack speaker = new Speaker();
        Jack headPhone = new HeadPhone();

        PlayerApp spotify = new Spotify();
        PlayerApp appleMusic = new AppleMusic();

        Computer laptop = new Laptop(speaker,spotify);
        Computer phone = new Phone(headPhone,appleMusic);

        laptop.playMusic(song);
        System.out.println("+++++++++++++++++++++++++");
        phone.playMusic(song);
    }


}
