package creational.factoryPattern;

public class PhoneStore {
    public static void main(String[] args){
        Phone s23 = PhoneFactory.getPhone(PhoneModels.S23,6.7f);
        System.out.println(s23);

        Phone iPhone11 = PhoneFactory.getPhone(PhoneModels.Iphone11,6.1f);
        System.out.println(iPhone11);
    }
}
