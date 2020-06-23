package basics;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of term you want in fibonacci sequence");
        int n = sc.nextInt();
        int a=0,b=1,c;
        while(n-- > 0){
            System.out.print(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
