
public class BMICalculator {

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight.";
        } else if (bmi < 24.9) {
            return "Normal.";
        } else if (bmi < 29.9) {
            return "Overweight.";
        } else {
            return "Obese.";
        }
    }
}
