package oop;

public class Car {
    String model;
    String colors;

    Car(String model,String colors){
        this.model = model;
        this.colors = colors;
    }

    void drive(){
        System.out.println("You are driving the " + this.colors +" " + this.model);
    }
}
