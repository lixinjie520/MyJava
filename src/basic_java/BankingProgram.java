package basic_java;
import java.util.Scanner;
public class BankingProgram {
//    要將Scanner實體放在class區域，所有方法都要存取，記得要加static
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        declare variables
        double balance = 1000;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            //        display menu
            System.out.println("BANKING PROGRAM.");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("----------");

//        get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("Thank you.Have a nice day.");
        scanner.close();
    }
    //        showBalance()
        static void showBalance(double balance){
            System.out.printf("$%.2f\n",balance);
        }
//        deposit()
        static double deposit(){
            double amount = 0;

            System.out.print("Enter an amount to be deposited: ");

            if(scanner.hasNextInt()){
                amount = scanner.nextDouble();
                if(amount < 0){
                    System.out.println("Amount can't be negative.");
                    return 0;
                }else{
                    return amount;
                }
            }else{
                System.out.println("Invalid input.Enter a positive amount.");
                scanner.next();
            }

            return amount;
            
        }
//        withdraw()
        static double withdraw(double balance){
            double amount;
            System.out.print("Enter amount to be withdrawn: ");
            amount = scanner.nextDouble();
            if(amount > balance){
                System.out.println("INSUFFICIENT FUNDS.");
                return 0;
            }else if(amount < 0){
                System.out.println("Amount can't be negative.");
                return 0;
            }else{
                return amount;
            }

        }
//        exit message
}
