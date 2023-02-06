/**
 * @class: Paint
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 4, 2023
 * @description: This program will calculate the required number of paint gallons
 * when given the room dimensions and number of doors and windows.
 */
import java.util.Scanner;
public class Paint {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the length: ");
    int length = in.nextInt();
    System.out.println("Enter the width: ");
    int width = in.nextInt();
    System.out.println("Enter the height: ");
    int height = in.nextInt();
    System.out.println("Enter the number of windows: ");
    int windows = in.nextInt() * 15;
    System.out.println("Enter the number of doors: ");
    int doors = in.nextInt() * 21;
    //Asks user to input dimensions of room and number of doors and windows.

    double surfaceArea = 2 * (length * height + height * width);
    double paintArea = surfaceArea - windows - doors;
    //calculates the surface area of the room and the area that needs to be painted.

    int gallons = (int) (paintArea / 350);
    double quarts = (double) gallons % 4;
    //calculates the number of quarts and gallons needed to paint the room.

    System.out.println("Required number of gallons: " + gallons);
    System.out.println("Required number of quarts: " + quarts);
    //prints out number of paint gallons and quarts needed to paint the room.

    }
}