package oops.staticAndConstructor;

class Cat{
    boolean hasFur;
    String color,breed;
    int legs;
    public void walk(){
        System.out.println("Cat is walking");
    }
    public void eat(){
        System.out.println("cat is eating");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
