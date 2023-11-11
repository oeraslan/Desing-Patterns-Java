package structural.adapter;

public class PlugSocket {

    public void supplyPower(WhiteWare whiteWare) {
        int volt = whiteWare.plugIn();
        System.out.println(volt + " volts from plug.");
    }

}
