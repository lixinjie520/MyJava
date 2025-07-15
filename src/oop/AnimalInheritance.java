package oop;

public class AnimalInheritance {
    public static void main(String[] args) {
//        繼承：一個類別可以繼承另外一個類別的屬性和方法。

        Dog dog = new Dog();
        Cat cat = new Cat();

//        System.out.println(dog.isAlive);
//        System.out.println(cat.isAlive);

        dog.eat();// 方法覆寫（override）的情況，在 Java 中如果子類別（subclass）的 method 覆寫了父類別（superclass）的同名 method，預設情況下會呼叫子類別自己的方法。
        cat.eat();
    }
}
