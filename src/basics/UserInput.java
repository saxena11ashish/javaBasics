package basics;
import java.util.Scanner;
public class UserInput {
    public static void main (String [] args){
    Scanner sc =  new Scanner(System.in);
    int x = sc.nextInt();
    System.out.print(x);

    sc.nextLine();      //when we take a string input after int input,type this once to get string input correctly
    String name = sc.nextLine();
    System.out.println(name);

// //greatest of 3 numbers
//    int a = 4,b=0,c=9;
//    System.out.println(a>b? a>c? a:c : b>c? b:c);

//    int principal = sc.nextInt();
//    float rate = sc.nextFloat();
//    int time = sc.nextInt();
//
//    float simpleInterest = principal*rate*time/100;
//
//    System.out.println("Answer is: "+ simpleInterest);
    }
}
