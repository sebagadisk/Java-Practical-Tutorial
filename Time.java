import java.util.Scanner;

public class Time {

    public static void main(String args[]) {

        System.out.println("Please enter time");
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        if(time >=1 && time <12){
            System.out.println("Day");
            if(time >=1 && time<=6){
                System.out.println("Morning");
            }else{
                System.out.println("Afternoon");
            }
        }else{
            System.out.println("Night");
        }
    }

}
