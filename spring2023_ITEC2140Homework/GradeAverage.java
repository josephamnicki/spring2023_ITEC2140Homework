/**
 * @class: GradeAverage
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 26, 2023
 * @description: This program will prompt the user for grades then provide an average of the grades.
 */
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first grade to add to the average: ");
        //prompts user to type in first grade
        int grade = in.nextInt();
        //stores input for first grade
        int average;
        //variable for average
                for (int i = 2; grade >= 0 || grade <= 100; i++) {
                    //begins to divide the sum of both grades by two as long as the grade is between 0 and 100
                    System.out.println("Enter another grade: ");
                    grade = grade + in.nextInt();
                    //sum of first and second grades put in
                    average = grade / i;
                    //continues to average the grade scores by the number of grades typed in
                    System.out.println("Grade average is: " + average);
                    //puts out a statement saying the grade average
                }
            }
        }