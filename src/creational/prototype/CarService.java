package creational.prototype;

public class CarService {

    public Car buildCar(int id,String name,String engine,String wheel){

        process();
        Car car = new Car();
        car.setId(id);
        car.setName(name);
        car.setEngine(buildEngine(id,engine));
        car.setWheel(buildWheel(id,wheel));

        return car;
    }

    public Engine buildEngine(int id,String engine){
        process();
        return new Engine(id,engine);
    }

    public Wheel buildWheel(int id,String wheel){
        process();
        return new Wheel(id,wheel);
    }

    private void process(){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
