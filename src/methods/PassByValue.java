package methods;

class Number {
    int a;
}

public class PassByValue {
    public static void main(String[] args) {
        Number val = new Number();
        val.a=20;
        int b=40;
        test(val,b);
        System.out.println("Non-primitive DT value: " + val.a); //non-primitive : value changes : call by REFERENCE
        System.out.println("Primitive DT value: " + b); //primitive : value doesn't change : call by VALUE
    }

    static public void test(Number z, int b){
        z.a = 200;
        b=400;
    }
}
