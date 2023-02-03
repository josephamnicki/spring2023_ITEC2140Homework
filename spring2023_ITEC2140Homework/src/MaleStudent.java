/**
 * @class: MaleStudent
 * @author: Joseph Amnicki
 * @course: ITEC 2140 - 04, Spring 2023
 * @written: February 2, 2023
 * @description: This program will calculate the number of male students
 * in a small middle school.
 */
public class MaleStudent {
    public static void main(String[] args){

        int totalStudents = 389; //total number of students at the school
        int femaleStudents = 175; //number of female students at the school
        int maleStudents; //number of male students at the school

        maleStudents = totalStudents - femaleStudents;
        //calculation for determining number of male students at school

        System.out.println("Number of male students: " + maleStudents);
        //puts out a message stating number of males students at school


    }
}
