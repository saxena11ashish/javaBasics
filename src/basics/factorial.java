package basics;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to calculate factorial");
        int num = sc.nextInt();
        long a=1;
        for(int i=2;i<=num;i++){
            a*=i;
        }
        System.out.println("Factorial of "+ num + " is " + a);
    }
}
