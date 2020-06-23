package strings;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine(),b=sc.nextLine();
        int alphaCount[] = new int[256];
        for(int c: a.toCharArray())
            alphaCount[c]++;
        for(int c: b.toCharArray())
            alphaCount[c]--;
        boolean isAnagram = true;
        for(int i: alphaCount){
            if(i!=0){
                isAnagram = false;
                break;
            }
        }
        System.out.println((isAnagram ? "ANAGRAM" : "NOT ANAGRAM"));
    }
}
