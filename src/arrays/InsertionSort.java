package arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[]= {2,1,8,-3,6,4,12};
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;

            for(int j=i;j<n;j++){   //finding index of minimum element in unsorted array
                if(a[j]<a[minIndex])
                    minIndex=j;
            }
                                    //placing minimum element at correct position
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
        for(int i: a)
            System.out.print(i + " ");
    }
}
