/**
 * @class: Cylinder
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 4, 2023
 * @description: This program will calculate the base area and volume of a cylinder
 * when the radius and length are provided.
 */
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the circle radius: ");
        int radius = in.nextInt();
        System.out.println("Enter the length of the cylinder: ");
        int length = in.nextInt();
        //asks user to input the base circle radius and the length of the cylinder.

        double area = 3.1416 * radius * radius;
        //calculates the area of the base circle for the cylinder.

        double volume = 3.1416 * radius * radius * length;
        //calculates the volume of the cylinder.

        System.out.println("Area of base circle: " + area);
        System.out.println("Volume of cylinder: " + volume);
        //prints out statement saying the area of the base circle and the volume of the cylinder.

    }
}
