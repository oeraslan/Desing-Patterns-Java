package creational.factoryPattern;

public class Samsung implements Phone {

    private PhoneModels model;
    private float screenSize;

    public Samsung(PhoneModels model, float screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    public PhoneModels getModel() {
        return model;
    }

    @Override
    public float getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "model=" + model +
                ", screenSize=" + screenSize +
                '}';
    }
}
