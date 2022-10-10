import java.util.Scanner;

public class SwitchCase {

    public static void main(String args[]) {

       String expression = "D";

       switch(expression) {

           case "A":
               System.out.println("Case A");
               break;
           case "B":
               System.out.println("Case B");
               break;
           case "C":
               System.out.println("Case C");
               break;
           default:
               System.out.println("invalid input!");
       }

    }

}
