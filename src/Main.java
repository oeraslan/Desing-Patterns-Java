import creational.builderPattern.BuilderPattern;
import creational.SingletonPattern;
import creational.builderPattern.Home;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Singleton Pattern---------");

        // Singleton pattern must create 1 instance and can not use new()
        for(int i = 0; i<5 ;i++){
            SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
            //SingletonPattern singletonPattern1 = new SingletonPattern();
        }

        System.out.println("----------Builder Pattern----------");

        Home home = BuilderPattern.startBuild()
                .setRoom(2)
                .setChicken(3)
                .setPool(false)
                .build();

        System.out.println(home);
    }
}