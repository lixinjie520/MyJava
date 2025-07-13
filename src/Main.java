import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        輸入體重
        System.out.println("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

//        輸入身高
        System.out.println("Enter your height in centimeter: ");
        double height = scanner.nextDouble();
        double heightInMeter = height / 100;
        scanner.close();
//        計算BMI
        double bmi = BMICalculator.calculateBMI(weight,heightInMeter);
        System.out.printf("Your BMI is: %.1f, it's "+ BMICalculator.categorizeBMI(bmi),bmi);



    }
}
