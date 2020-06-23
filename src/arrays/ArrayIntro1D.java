package arrays;

public class ArrayIntro1D {
    public static void main(String[] args){
    //Array declaration
        int [] newArr;  //newArr is an array with type int
        int n=10;
    //Array initialization
        newArr = new int[n]; //newArr has size = n

    //Array declaration and initialization : Single line
        int[] arr = new int[n];
        System.out.println(arr.length);
    //By default arrays are initialized with 0 value
//        int[] ns = new int[10];
//        for(int i:ns)
//            System.out.print(i+ " ");

    }
}
