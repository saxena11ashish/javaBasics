package arrays;

public class ArrayIntro2D {
    public static void main(String[] args) {
        int a[][] = new int[5][3];
//        int a[][]={{1,2,3},{4,5,6},{7,8,9},{7,8,9},{7,8,9}};
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[i][j]+ " ");
            System.out.println();
        }
    }
}
