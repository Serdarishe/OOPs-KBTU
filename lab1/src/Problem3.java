import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scan.nextInt();
        double answer;
        if(score >= 95) answer = 4;
        else if (score >= 90) answer = 3.67;
        else if (score >= 85) answer = 3.33;
        else if (score >= 80) answer = 3;
        else if (score >= 75) answer = 2.67;
        else if (score >= 70) answer = 2.33;
        else if (score >= 65) answer = 2;
        else if (score >= 60) answer = 1.67;
        else if (score >= 55) answer = 1.33;
        else if (score >= 50) answer = 1;
        else if (score >= 25) answer = 0.5;
        else answer = 0;

        System.out.println("Your gpa is: " + answer);
    }
}
