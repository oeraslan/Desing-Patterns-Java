package structural.adapter;

public class PhoneAdapter implements WhiteWare{

    private Phone phone;

    public PhoneAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugIn() {
        return phone.charge();
    }
}
