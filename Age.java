import java.util.Scanner;

public class Age {

    public static void main(String args[]) {
      
       System.out.println("Enter your age");
       Scanner input = new Scanner(System.in);
       int age = input.nextInt();
       while(age >= 18){
           System.out.println("Your age is must be greater than or equal 18 to watch this movie");
           System.exit(0);
       }
       System.out.println("Your age is less than 18");

    }

}
