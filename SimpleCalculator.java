import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String args[]) {
      
       System.out.println("Please enter x and y");
       Scanner input = new Scanner(System.in);
       int x = input.nextInt(), y = input.nextInt(), sum, div, sub, mult;
       sum = x + y; //10
       sub = x - y; //0
       div = x / y; //1
       mult = x * y; //25
       System.out.println("Sum of " + x + " and " + y + " is: " + sum);
       System.out.println("Subtraction of " + x + " and " + y + " is: " + sub);
       System.out.println("Division of " + x + " and " + y + " is: " + div);
       System.out.println("Multiplication of " + x + " and " + y + " is: " + mult);
      
    }
}
