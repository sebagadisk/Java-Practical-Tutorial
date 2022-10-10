import java.util.Scanner;

public class PassedFailed {

    public static void main(String args[]) {

       double marks = 25;
       while (marks >= 45) {
           System.out.println("PASSED");
           System.exit(0);
       }
       System.out.println("FAILED");

    }

}
