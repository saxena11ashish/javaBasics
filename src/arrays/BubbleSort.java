package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]= {2,1,8,-3,6,4,12};
        for(int i=0;i<a.length-1;i++){
            boolean sorted = true;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted=false;
                }
            }
            if(sorted)break;
        }
        for(int i:a)
            System.out.print(i+ " ");
    }
}
