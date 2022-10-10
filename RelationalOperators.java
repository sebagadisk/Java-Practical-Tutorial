import java.util.Scanner;

public class RelationalOperators {

    public static void main(String args[]) {

        // == , != , >, <, >=, <=
       System.out.println("Please enter x and y");
       Scanner input = new Scanner(System.in);
       int x = input.nextInt(), y = input.nextInt();
       System.out.println("x is " + x + " y is " + y);
       // == operator
       System.out.println(x+" == "+y);
       System.out.println(x == y); // false
       // != Operator
       System.out.println(x+" != "+y);
       System.out.println(x != y); // true
       // > Operator
       System.out.println(x+" > "+y);
       System.out.println(x > y); // false
       // < operator
       System.out.println(x+" < "+y);
       System.out.println(x < y); // true;
       // >= operator
       System.out.println(x+" >= "+y);
       System.out.println(x >= y); // false
       // <= operator
       System.out.println(x+" <= "+y);
       System.out.println(x <= y); // true;

    }

}
