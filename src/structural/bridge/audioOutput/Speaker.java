package structural.bridge.audioOutput;

public class Speaker implements Jack {
    @Override
    public void getSound(String sound) {
        System.out.println("Speaker play ->" + sound);
    }
}
