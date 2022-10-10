import java.util.Scanner;

public class Age {

    public static void main(String args[]){

        // int boolean char String double float ...
        int age;

        System.out.println("Please enter your age");
        System.out.print("=> ");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        if(age >= 18){
            System.out.println("Your age must be >= 18 to watch this movie");
            System.exit(0);
        }else{
            System.out.println("Invalid input");
            System.exit(0);
        }
        
    }

}
