import java.lang.StringBuilder;
import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder stb =  new StringBuilder(scan.nextLine());
        StringBuilder stb2 =  new StringBuilder(stb).reverse();
        System.out.println(stb);
        System.out.println(stb2);
        if(stb.toString().contentEquals(stb2))System.out.println("It is palindrome!");
        else System.out.println("It is not palindrome!");
    }
}
