package structural.adapter;

public class Phone {

    private final int volt;

    public Phone(int volt) {
        this.volt = volt;
    }

    public int charge() {
        System.out.println("Phone charging...");
        return volt;
    }

}
