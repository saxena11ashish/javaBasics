package basics;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prime = true;
        System.out.println("Enter a number");
        int a = sc.nextInt();
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                prime = false;
                break;
            }
        }
        System.out.println((prime? "prime":"not prime"));
    }
}
