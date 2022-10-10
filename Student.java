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
        fullName = nameInput.nextLine(); //Dynamic input

        System.out.println("Please enter your age");
        System.out.print("=> ");
        Scanner input = new Scanner(System.in);
        age = input.nextInt(); //Dynamic input

        System.out.println("Please enter your mark %");
        System.out.print("=> ");
        Scanner markInput = new Scanner(System.in);
        mark = markInput.nextDouble(); //Dynamic input

        //Display
        System.out.println("--------------------------------------");
        System.out.println("| Full Name: "+ fullName);
        System.out.println("| Age :"+ age );
        System.out.println("| Mark :"+ mark );
        System.out.println("--------------------------------------");


    }

}
