import creational.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        // Singleton pattern must create 1 instance and can not use new()
        for(int i = 0; i<5 ;i++){
            SingletonPattern singletonPattern = SingletonPattern.getSingletonPattern();
            //SingletonPattern singletonPattern1 = new SingletonPattern();
        }

    }
}