package oop;

public class CarArrayObject {
    public static void main(String[] args) {
//        Car car1 = new Car("Mustang","Red");
//        Car car2 = new Car("Corvette","Blue");
//        Car car3 = new Car("Charger","Pink");

//        car1.drive();
//        car2.drive();
//        car3.drive();

//        Car[] cars = {car1, car2, car3};

//      匿名物件Anonymous Object，沒有上述的car1, car2, car3
        Car[] cars = {new Car("Mastang","Red"),
                      new Car("Corvette","Blue"),
                      new Car("Charger","Pink")};

//        change the color of each car
        for(Car car: cars){
            car.colors = "black";
        }

        for(Car car: cars){
            car.drive();
        }
    }
}
