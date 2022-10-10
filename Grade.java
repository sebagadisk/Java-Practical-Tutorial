/*
    title: Java program to find grade of student
    author: Software Engineer Sebagadis Kahsay
 */

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        while (true) {

            System.out.println("***************************************************");
            System.out.println("** Please enter your percentage mark out of 100 **");
            System.out.println("***************************************************");
            System.out.print("=>");
            Scanner input = new Scanner(System.in);
            double mark = input.nextDouble();

            if (mark <= 100 && mark >= 90) {
                System.out.println("Grade A+");
            } else if (mark < 90 && mark >= 85) {
                System.out.println("Grade A");
            } else if (mark < 85 && mark >= 80) {
                System.out.println("Grade A-");
            } else if (mark < 80 && mark >= 75) {
                System.out.println("Grade B+");
            } else if (mark < 75 && mark >= 70) {
                System.out.println("Grade B");
            } else if (mark < 70 && mark >= 65) {
                System.out.println("Grade B-");
            } else if (mark < 65 && mark >= 60) {
                System.out.println("Grade C+");
            } else if (mark < 60 && mark >= 50) {
                System.out.println("Grade C");
            } else if (mark < 50 && mark >= 45) {
                System.out.println("Grade C-");
            } else if (mark < 45 && mark >= 40) {
                System.out.println("Grade D");
            } else if (mark < 40 && mark >= 0) {
                System.out.println("Failed! Grade F");
            } else {
                System.out.println("invalid Input");
            }

            // Display confirmation msg
            System.out.println("Would you like to continue checking grade? (Enter 'N' to terminate the program)");
            Scanner secInput = new Scanner(System.in);
            String answer = secInput.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                // Terminate the program
                System.exit(0);
            }

        }// End While Loop
    }// End Main Method
}// End Grade Class
