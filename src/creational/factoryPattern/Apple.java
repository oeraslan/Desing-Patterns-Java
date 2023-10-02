package creational.factoryPattern;

public class Apple implements Phone{

    private PhoneModels model;
    private float screenSize;
    public Apple(PhoneModels model, float screenSize) {
        this.model=model;
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
        return "Apple{" +
                "model=" + model +
                ", screenSize=" + screenSize +
                '}';
    }
}
