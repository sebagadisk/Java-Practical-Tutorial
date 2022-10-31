import java.util.Scanner;

public class SwitchCase {

    public static void main(String args[]) {
        // Check balance, withdraw, deposit, change pin;
        double balance = 5000;
        double withdraw = 0;
        double deposit = 0;
        int pin;
        int changePin;
        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Please enter your pin");
        Scanner inputPin = new Scanner(System.in);
        pin = inputPin.nextInt();
        if (pin == 1234) {
            System.out.println("**********************************");
            System.out.println("** Menu **************************");
            System.out.println("** Choose '1' for balance ********");
            System.out.println("** Choose '2' for withdraw *******");
            System.out.println("** Choose '3' for deposit ********");
            System.out.println("** Choose '4' to Change PIN ******");
            System.out.println("**********************************");
            System.out.print("==> ");
            Scanner op = new Scanner(System.in);
            int ch = op.nextInt();
            switch (ch) {
                case 1:
                    displayBalance(balance);
                    break;
                case 2:
                    System.out.println("Please Enter Amount");
                    double amountWithdraw = inputAmount.nextDouble();
                    withdraw(balance, amountWithdraw);
                    break;
                case 3:
                    System.out.println("Please Enter Amount");
                    double amountDeposit = inputAmount.nextDouble();
                    deposit(balance, amountDeposit);
                    break;
                case 4:
                    System.out.println("PIN changed");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } else {
            System.out.println("Incorrect PIN! Please try again");
        }

    }

    public static void displayBalance(double balance) {
        System.out.println("---------------------------------------------");
        System.out.println("Your balance is: " + balance);
        System.out.println("---------------------------------------------");
    }

    public static double withdraw(double balance, double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("---------------------------------------------");
            System.out.println("You withdraw " + amount + " birr");
            System.out.println("---------------------------------------------");
            displayBalance(balance);
        } else {
            System.out.println("Your withdraw is over the balance");
        }
        return balance;
    }

    public static double deposit(double balance, double amount) {
        balance = balance + amount;
        System.out.println("---------------------------------------------");
        System.out.println("The money has been deposited successful");
        displayBalance(balance);
        System.out.println("---------------------------------------------");
        return balance;
    }


}
