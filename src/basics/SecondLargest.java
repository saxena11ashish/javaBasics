package basics;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={3,6,1,10,9,15,13};
        int largest= Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>=largest && i>=secondLargest){
                secondLargest=largest;
                largest=i;
            }
            else if(i>=secondLargest)
                secondLargest=i;
        }
        System.out.println(secondLargest);
    }
}
