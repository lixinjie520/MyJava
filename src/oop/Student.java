package oop;

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    /* constructor : A constructor in Java is a special method that is    used to initialize objects.
       The constructor is called when an object of a class is created. */
        Student(String name,int age,double gpa){
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.isEnrolled = true;
        }

        void study(){
            System.out.println(this.name +" is studying.");
        }
}
