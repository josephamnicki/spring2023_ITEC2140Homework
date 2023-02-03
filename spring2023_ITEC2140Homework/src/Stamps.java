/**
 * @class: Stamps
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 2, 2023
 * @description: This program will calculate the difference in the number of stamps
 * between Susan and Jean's collections.
 */
public class Stamps {
    public static void main(String[] args){

    int animalStamps = 8; //number of stamps in Susan's collection
    int carStamps = 40; //number of stamps in Jean's collection
    int differenceStamps; //difference between Jean and Susan's collections

    differenceStamps = carStamps - animalStamps;
    //formula for determining how many more stamps Jean has than Susan

    System.out.println("Jean has " + differenceStamps + " more stamps than Susan.");
    //puts out a message stating how many more stamps Jean has than Susan

    }
}
