package basic_java;
import java.util.Scanner;
public class Array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = new String[3];

        for(int i = 0; i < fruits.length; i++){
            System.out.print("Enter a fruit: ");
            fruits[i] = scanner.nextLine();
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }

//        System.out.println(fruits.length);
    }
}
