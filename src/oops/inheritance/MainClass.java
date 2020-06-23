package oops.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Person p = t;
        System.out.println(p instanceof Teacher);
    }
}
