import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String args[]) {

       // Simple Calculator using java
       int num1, num2, sum, div, sub, mult;

       System.out.println("Please enter num1");
       Scanner input = new Scanner(System.in);
       num1 = input.nextInt();
       System.out.println("Choose +, *, /, -");
       Scanner op = new Scanner(System.in);
       String option = op.nextLine();
       System.out.println("Please enter num2");
       num2 = input.nextInt();
       switch (option){
           case "+":
               sum = num1 + num2;
               System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
               break;
           case "-":
               sub = num1 - num2;
               System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + sub);
               break;
           case "*":
               mult = num1 * num2;
               System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + mult);
               break;
           case "/":
               div = num1 / num2;
               System.out.println("Division of " + num1 + " and " + num2 + " is: " + div);
               break;
           default:
               System.out.println("Invalid Input!");
       }

    }

}
