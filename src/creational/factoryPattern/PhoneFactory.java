package creational.factoryPattern;

public class PhoneFactory {
    public static Phone getPhone(PhoneModels model, float screenSize) {
        switch (model) {
            case Iphone11:
                return new Apple(PhoneModels.Iphone11, screenSize);
            case Iphone14:
                return new Apple(PhoneModels.Iphone14, screenSize);
            case A34:
                return new Samsung(PhoneModels.A34, screenSize);
            case A54:
                return new Samsung(PhoneModels.A54, screenSize);
            case S23:
                return new Samsung(PhoneModels.S23, screenSize);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
