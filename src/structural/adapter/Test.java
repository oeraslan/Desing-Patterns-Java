package structural.adapter;

public class Test {
    public static void main(String[] args) {
        PlugSocket plug = new PlugSocket();

        Fridge fridge = new Fridge();
        Iron iron = new Iron();
        Phone phone = new Phone(25);
        PhoneAdapter adapter = new PhoneAdapter(phone);

        plug.supplyPower(fridge);
        plug.supplyPower(iron);

        plug.supplyPower(adapter);
    }
}
