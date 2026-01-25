import java.util.Scanner;
import java.lang.Math;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your equation: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        double D = Math.pow(b, 2) -  4 * a * c;

        if(D < 0) System.out.println("No root");
        else{
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            if(x1 == x2)System.out.println("Our root is: " + x1);
            else System.out.println("Our roots: " + x1 + " and " + x2);
        }
    }
}
