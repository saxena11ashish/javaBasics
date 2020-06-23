package oops.abstraction;

public abstract class Car {     //since class has abstract methods, it has to be made abstract using the keyword
    public abstract void accelerate();
    public abstract void brake();
    //the above methods are made abstract as we don't provide a definition here, just name them,i.e. mention what functions car and it's child class will have

    public void notAnAbstractMethod(){
        System.out.println("Abstract class can have concrete/regular methods");
    }
}
