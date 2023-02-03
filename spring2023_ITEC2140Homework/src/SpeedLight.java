/**
 * @class: SpeedLight
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 2, 2023
 * @description: This program will calculate the amount of time it takes
 * to hear a lightning strike from your position.
 */
public class SpeedLight {
    public static void main(String[] args){

        int LightSpeed = 340; //meters traveled by light per second
        int Time = 5; //number of seconds elapsed since lightning strike
        int product; //distance traveled by light to reach listener

        product = LightSpeed * Time; //calculation for distance between listener and lightning strike

        System.out.println("Distance of strike from you: " + product + " meters");
        //puts out a message stating distance of the strike from you
    }
}
