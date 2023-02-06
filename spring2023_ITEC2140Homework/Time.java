/**
 * @class: Time
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 3, 2023
 * @description: When given a number of seconds, this program will
 * convert the total number of seconds into hours, minutes, and seconds.
 */
import java.util.Scanner;
public class Time {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number of seconds: ");
        int time = in.nextInt();
        //asks the user to input a number of seconds

        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        //calculates the number of hours, minutes, and seconds from the user's input

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        //prints out statements for the total number of hours, minutes, and seconds

        }
}

