package arrays;

import java.util.Arrays;

public class TwoNumbersWithSumCloseTo0 {
    public static void main(String[] args) {
        int[] a= {1,3,-45,7,8,20,-40,6};
        Arrays.sort(a);
//        for(int a:arr)
//            System.out.print(a + " ");
        int l=0,r=a.length-1,min_l=0,min_r=a.length-1,min=Integer.MAX_VALUE;
        while(l<r){
            int sum = a[l]+a[r];
            if(Math.abs(sum) < Math.abs(min)){
                min_l=l;
                min_r=r;
                min=sum;
            }
            if(sum>0)
                r--;
            else if(sum<0)
                l++;
            else
                break;
        }
        System.out.println(a[min_l]+" & "+a[min_r]+" are the values whose sum is closest to 0.");
    }
}
