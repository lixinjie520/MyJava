package basic_java;
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        double number1;
        boolean isStudent;

        number = random.nextInt(1,7);
        number1 = random.nextDouble(1.0,7.0);
        isStudent = random.nextBoolean();

        System.out.println(number);
        System.out.println(number1);
        System.out.println(isStudent);

    }
}
