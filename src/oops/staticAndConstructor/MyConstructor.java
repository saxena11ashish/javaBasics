package oops.staticAndConstructor;

class Dog{
    Dog(){      //CONSTRUCTOR: no return type, same name as class
        System.out.println("Object is created");
    }
    int eyes,legs;
}

class Vehicle{
    int wheels;
    Vehicle(int wheels){
        this.wheels = wheels;
    }
}

public class MyConstructor {
    MyConstructor(){
        System.out.println("Created myconstructor object");
    }
    public static void main(String[] args) {
//        MyConstructor m= new MyConstructor();
//        Dog d= new Dog();
        Vehicle cars = new Vehicle(23);
        System.out.println(cars.wheels);
    }
}
