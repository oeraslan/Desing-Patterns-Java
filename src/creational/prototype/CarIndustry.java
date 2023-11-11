package creational.prototype;

import java.util.Date;

public class CarIndustry {
    public static long totalTime = 0;
    public static void main(String[] Args){

        CarService carService = new CarService();
        Date firstCarTime = new Date();
        Car firstCar = carService.buildCar(1,"A5","4.0","21");
        printTime(firstCar,firstCarTime);

        Date secondCarTime = new Date();
        Car secondCar = carService.buildCar(2,"A3","1.6","17");
        printTime(secondCar,secondCarTime);

        Date thirdCarTime = new Date();
        Car thirdCar = firstCar.clone();
        thirdCar.setName("A6");
        printTime(thirdCar,thirdCarTime);

        Date fourthCarTime = new Date();
        Car fourthCar = firstCar.clone();
        fourthCar.setName("A4");
        fourthCar.setEngine(carService.buildEngine(4,"3.0"));
        printTime(fourthCar,fourthCarTime);
        System.out.println("------------------------------------------------------");
        System.out.println(firstCar);
    }
    public static void printTime(Car car,Date start){
        Date end = new Date();
        long time = end.getTime()/1000 - start.getTime()/1000;
        totalTime = totalTime + time;
        System.out.println(car);
        System.out.println("Process time : " + time);
        System.out.println("Total time :" + totalTime);
    }
}
