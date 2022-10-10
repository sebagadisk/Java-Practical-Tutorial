import java.util.Scanner;

public class JavaOperators {

    public static void main(String args[]) {

       int x = 5, y = 3;

       //post increment x++, pre increment ++x

       System.out.println("X: " + x++); //5

       System.out.println("Y: "+ ++y); //4

       System.out.println("X: "+  ++x); //7

       System.out.println("Y: "+ y++); //4

       System.out.println("Y: " + ++y); //6

       System.out.println("X: " + x++); //7

       System.out.println("X: " + ++x); //9

       System.out.println("X: " + ++x); // 10

       System.out.println("X: " + x); //10

       System.out.println("Y: " + y); //6

    }

}
