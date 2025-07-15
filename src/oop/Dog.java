package oop;

public class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating.");
        super.eat();// super 關鍵字只能用在非 static 方法中。
    }
}
