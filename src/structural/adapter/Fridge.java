package structural.adapter;

public class Fridge implements WhiteWare {

    private final int volt;

    public Fridge() {
        this.volt = 220;
    }

    @Override
    public int plugIn() {
        System.out.println("Fridge plug in...");
        return volt;
    }
}
