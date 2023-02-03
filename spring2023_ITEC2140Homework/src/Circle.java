/**
 * @class: Circle
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 2, 2023
 * @description: This program will calculate the area and perimeter
 * of a circle with a given radius.
 */
public class Circle {
    public static void main(String[] args){

        double radius = 9.5; //radius of the circle

        double areaOfCircle = radius * radius * Math.PI; //formula for area of the circle
        double perimeterOfCircle = 2 * radius * Math.PI; //formula for perimeter of the circle

        System.out.println("Area of this circle is: " + areaOfCircle);
        //puts out message saying area of the circle

        System.out.println("Perimeter of this circle is: " + perimeterOfCircle);
        //puts out message saying perimeter of the circle

    }
}

