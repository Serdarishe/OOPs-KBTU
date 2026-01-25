import java.util.Scanner;


public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your balance: ");
        int n = scan.nextInt();
        System.out.print("Write your interest rate(%): ");

        int p = scan.nextInt();
        System.out.println("Your balance now is: " + (n + n* p / 100));
    }
}
