package basic_java;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {

/*
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(3,2);
        result = Math.abs(-4);
        result = Math.sqrt(4);
        result = Math.round(2.67);
        result = Math.ceil(2.23);
        result = Math.floor(2.23);
        result = Math.max(12,14);
        result = Math.min(12,14);
        System.out.println(result);


        HYPOTENUSE c = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse (side c) is " + c+"cm.");

        scanner.close();
*/
//        circumference = 2 * Math.PI * radius;
//        area = Math.PI * Math.pow(radius, 2);

        Scanner scanner = new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The circumference is %.2f cm\n",circumference);
        System.out.printf("The area is %.2f cm²\n",area);

    }
}
