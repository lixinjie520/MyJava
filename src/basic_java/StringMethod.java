package basic_java;
import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {
/*
        String title = "Interstellar Parasite";

        System.out.println(title.contains("Hello"));
*/
        Scanner scanner = new Scanner(System.in);
        String email;
        System.out.print("Enter your email: ");
        email = scanner.nextLine();
//        String name = email.substring(0,8);
        String name = email.substring(0,email.indexOf("@"));
//        String domain = email.substring(9);
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Your name is: "+name);
        System.out.println("Your domain is: "+domain);
    }
}

