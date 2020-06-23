package oops.staticAndConstructor;
//class AAA{
//    static int b=21;
//}

public class StaticKeyword {
//  static{
//              this is called a static block, these blocks run before main() function
//  }
    static {
        System.out.println("Printing from static block 1");
    }
    static {
        System.out.println("Printing from static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Printing from main");

//  //Nested Static class to create object without creating object of container class
//        A objA = new A();
//        A.B objB = objA.new B();    //To create an object of B, we had to create an object of A first
//
//        A.C objC = new A.C();         //To create an Object of C, we can directly use class A instead of creating its variable

//  //Exploring static int
//        AAA a = new AAA();
//        AAA c = new AAA();
//        a.b++;
//        c.b++;
//        System.out.println(a.b);


//        System.out.println( (int) Math.floor(Math.random()*10)  );
    }
}
