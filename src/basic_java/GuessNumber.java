package basic_java;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 3;
        int max = 100;
        int min = 1;
        int randomNumber = random.nextInt(min,max + 1);
        boolean isCorrect = false;

        System.out.println("Guess the number between " + min +" to " + max +", you can try " + attempts + " times.");

        for(int i = 1; i <= attempts ; i++){
            while(true){
                System.out.print("Attempts: " + i + ", enter your guess: ");
                if(scanner.hasNextInt()){
                    guess = scanner.nextInt();
                    if(guess >= min && guess <= max){
                        break;
                    }else{
                        System.out.println("Please enter a number between " + min +" to "+ max +".");
                    }
                }else{
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();// 清除輸入錯誤
                }
            }

            if(guess > randomNumber){
                System.out.println("Too high,try again.");
            }else if(guess < randomNumber){
                System.out.println("Too low,try again.");
            }else{
                System.out.println("Correct.You guess it in " + i + " attempts.");
                isCorrect = true;
                break;
            }
        }
//      次數用完還沒猜到
        if(!isCorrect){
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
        }
        scanner.close();
    }
}