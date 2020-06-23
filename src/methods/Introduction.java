package methods;

public class Introduction {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Greater number is: " + maxOf(a,b));
    }
    static public int maxOf(int a,int b){   //this function is made static as it is called in a static function i.e. main()
        return a>b?a:b;
    }

    //Method overloading : same function name, different signature
    static public void a(int a,float b){
    }
    static public void a(float a,int b){
    }
}
