package collections.listInterface;

public class GenericClass<A,B> {
    A a;
    B b;
    GenericClass(A a,B b){
        this.a = a;
        this.b = b;
    }
    public void getDescription(){
        System.out.println("a="+ a+ " b="+b);
    }

}
