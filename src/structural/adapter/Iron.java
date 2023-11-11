package structural.adapter;

public class Iron implements WhiteWare {

    private final int volt;

    public Iron() {
        this.volt = 220;
    }

    @Override
    public int plugIn() {
        System.out.println("Iron plug in...");
        return volt;
    }
}
