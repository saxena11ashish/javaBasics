package oops.abstraction;

public class RepairShop {
    public static void repairCar(Car car){
        System.out.println("Car is repaired");
    }
    public static void main(String[] args) {
        WagonR w = new WagonR();
        Audi a = new Audi();
        repairCar(w);
        repairCar(a);
    }
}
