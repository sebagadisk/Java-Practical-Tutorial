import java.util.Scanner;

public class  LogicalOR {

    public static void main(String args[]) {

        // initializing variables
       int a = 0, b = 1, c = 10, d = 30;

       // Displaying a, b, c, d
       System.out.println("Var1 = " + a);
       System.out.println("Var2 = " + b);
       System.out.println("Var3 = " + c);
       System.out.println("Var4 = " + d);

       // using logical OR to verify
       // two constraints
       if (a > b || c == d) {
           System.out.println("One or both + the conditions are true");
       }
       else {
           System.out.println("Both the + conditions are false");
       }

    }

}
