package creational;

public class SingletonPattern {
    private static volatile SingletonPattern singletonPattern;

    private static int count=0;

    private SingletonPattern() {
        System.out.println("Singleton Pattern created");
    }

    public static SingletonPattern getSingletonPattern(){
        // I check firstly nullable because checking everytime synchronized our project get slow
        if(singletonPattern == null){
            synchronized (SingletonPattern.class){
                if(singletonPattern == null){
                    singletonPattern  = new SingletonPattern();
                }
            }
        }

        count++;
        System.out.println("Count :"+count);
        return singletonPattern;
    }

}
