import java.util.Scanner;

public class Student {

    public static void main(String args[]){

        // int boolean char String double float ...
        int age;
        String fullName;
        double mark;

        System.out.println("Please enter your full name");
        System.out.print("=> ");
        Scanner nameInput = new Scanner(System.in);
        fullName = nameInput.nextLine();

        System.out.println("Please enter your age");
        System.out.print("=> ");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        if(age < 18 && age >= 1){
            System.out.println("Your age must be > 18");
            System.exit(0);
        }else if (age > 18 && age < 65){
            System.out.println("Your age is between 19 N 65");
        }
        else{
            System.out.println("Invalid input");
            System.exit(0);
        }

        System.out.println("Please enter your mark %");
        System.out.print("=> ");
        Scanner markInput = new Scanner(System.in);
        mark = markInput.nextDouble();

        System.out.println("--------------------------------------");
        System.out.println("| Full Name: "+ fullName);
        System.out.println("| Age :"+ age );
        System.out.println("| Mark :"+ mark );
        System.out.println("--------------------------------------");


    }

}
