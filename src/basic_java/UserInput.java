package basic_java;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Are you a student?(true or false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Hello "+name);
        if(isStudent){
            System.out.println("You are a student.");
        }else{
            System.out.println("You are not a student.");
        }
        scanner.close();
    }
}
