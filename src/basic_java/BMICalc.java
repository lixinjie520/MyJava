package basic_java;
import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double bmi;
        System.out.println("Let's calculate your BMI.");
        System.out.print("Enter your weight in kilograms: ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height in centimeter: ");
        height = scanner.nextDouble() / 100;

        bmi = weight / (height * height);

        if(bmi < 18.5){
            System.out.printf("Your BMI is: %.2f.Underweight.",bmi);
        }else if(bmi < 25){
            System.out.printf("Your BMI is: %.2f.Normal.",bmi);
        }else if(bmi < 30){
            System.out.printf("Your BMI is: %.2f.Overweight.",bmi);
        }else if(bmi <35){
            System.out.printf("Your BMI is: %.2f.Obesity.",bmi);
        }
    }
}
