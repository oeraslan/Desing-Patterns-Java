package structural.bridge.audioOutput;

public class HeadPhone implements Jack {
    @Override
    public void getSound(String sound) {
        System.out.println("HeadPhone play ->" + sound);
    }
}
