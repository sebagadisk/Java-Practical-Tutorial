/*
    title: Java program to find grade of student
    author: Software Engineer Sebagadis Kahsay
 */

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("** Enter your percentage mark **");
        System.out.println("**********************************");
        System.out.print("==> ");
        double mark = scan.nextDouble();

        if (mark >= 90) {
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
        } else {
            System.out.println("Failed! Grade F");
        }
    }

}
