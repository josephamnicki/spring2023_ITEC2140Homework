/**
 * @class: Cycle
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 2, 2023
 * @description: This program will calculate the number of tricycles currently
 * at the cycle shop.
 */
public class Cycle {
    public static void main(String[] args){

        int totalWheels = 47; //total number of wheels among bicycles and tricycles
        int bicycles = 10; //number of bicycles in the shop
        int tricycles; //number of tricycles in the shop

        tricycles = (totalWheels - (2 * bicycles)) / 3;
        /**calculation for number of tricycles in shop
         * note: tricycles have three wheels, hence the remaining wheels
         * being divided by three
         */

        System.out.println("Number of tricycles: " + tricycles);
        //puts out a message stating number of tricycles in the shop
    }
}
