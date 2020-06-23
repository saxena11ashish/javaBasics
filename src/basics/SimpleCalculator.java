package basics;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd number");
        float b = sc.nextFloat();
        System.out.println("Enter operator");
        sc.nextLine();
        char op = sc.nextLine().charAt(0);
        switch(op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("WRONG OPERATOR INPUT");
        }
    }
}
