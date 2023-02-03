/**
 * @class: Chocolate
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 2, 2023
 * @description: This program will calculate how many bags that can hold 3 bars of chocolate
 * are needed to hold 9 bags that currently hold two bars each.
 */
public class Chocolate {
    public static void main(String[] args){

        int totalChocolateBags = 9; //total number of chocolate bags
        int newBags = 3; //capacity of each new bag
        int neededBags; //number of bags required to hold all chocolate bars

        neededBags = (totalChocolateBags * 2) / newBags;
        /**calculation for number of bags needed to hold all the bars
         * note: each old bag carried two bars, hence the total being
         * multiplied by two
         */

        System.out.println("Number of needed bags: " + neededBags);
        //puts out a message stating number of bags needed to carry all the bars

    }
}
