package arrays;
import java.util.Scanner;


public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("enter r1");
        r1=sc.nextInt();
        System.out.println("enter c1");
        c1=sc.nextInt();
        System.out.println("enter r2");
        r2=sc.nextInt();
        System.out.println("enter c2");
        c2=sc.nextInt();
        if(c1!=r2) System.out.println("can't multiply as r1 must be equal to c2");
        else{
            int ans[][] = new int[r1][c2];
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            System.out.println("Enter matrix 1");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++)
                    a[i][j]=sc.nextInt();
            }
            System.out.println("Enter matrix 2");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++)
                    b[i][j]=sc.nextInt();
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    int temp=0;
                    for(int k=0;k<r1;k++){
                        temp+= a[i][k]*b[k][j];
                    }
                    ans[i][j] = temp;
                }
            }
            System.out.println("answer is:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }

        }

    }
}
