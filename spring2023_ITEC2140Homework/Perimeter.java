
import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of side one: ");
        int s1 = in.nextInt();
        System.out.println("Enter the length of side two: ");
        int s2 = in.nextInt();
        System.out.println("Enter the length of side three: ");
        int s3 = in.nextInt();

        int perimeter = s1 + s2 + s3;

        if ((s1 + s2) > s3 && (s2 + s3) > s1 && (s1 + s3) > s2) {
            System.out.println("The perimeter is: " + perimeter);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}

