
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight = in.nextDouble();
        weight = weight * 0.4536;
        System.out.println("Enter your height in inches: ");
        double height = in.nextDouble();
        height = height * 0.0254;

        double bmi = weight / (height * height);

        if (bmi < 18.5){
            System.out.println("You are underweight.");
        }
        else if(bmi >= 18.5 && bmi <= 25) {
            System.out.println("You are normal.");
        }
        else if(bmi >= 25 && bmi <=30) {
            System.out.println("You are overweight.");
        }
        else if(bmi >= 30) {
            System.out.println("You are obese.");
        }





    }
}
