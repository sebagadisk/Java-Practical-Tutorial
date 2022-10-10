import java.util.Scanner;

public class ATM {

    public static void main(String args[]) {

      // Check balance, withdraw, deposit, change pin;
      double balance = 5000;
      double withdraw= 0;
      double deposit = 0;
      int pin;
      int changePin;
      System.out.println("Please enter your pin");
      Scanner inputPin = new Scanner(System.in);
      pin = inputPin.nextInt();
      if(pin == 1234){
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
          switch (ch){
              case 1:
                  System.out.println("Your Balance is "+balance);
                  break;
              case 2:
                  System.out.println("Enter withdrawal amount");
                  System.out.print("==> ");
                  Scanner inputWith = new Scanner(System.in);
                  withdraw = inputWith.nextDouble();
                  if(withdraw >= balance){
                      balance = balance - withdraw; // 4.9k
                      System.out.println("Your Balance is "+balance);
                  }else{
                      System.out.println("Insufficient balance");
                  }

                  break;
              case 3:
                  System.out.println("Enter amount");
                  System.out.print("==> ");
                  Scanner inputDep = new Scanner(System.in);
                  deposit = inputDep.nextDouble();
                  balance = balance + deposit; //5.2k
                  System.out.println("Your Balance is "+balance);
                  break;
              case 4:
                  System.out.println("PIN changed");
                  break;
              default:
                  System.out.println("Invalid Input");
                  break;
          }
      }else{
          System.out.println("Incorrect PIN! Please try again");
      }

    }

}
