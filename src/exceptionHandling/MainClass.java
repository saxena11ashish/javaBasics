package exceptionHandling;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        try{
            int a=5,b=0;
            int c = a/b;

            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage() + " occured");
        } catch (ArrayIndexOutOfBoundsException e){

        } finally {

        }
        System.out.println("Code still running even after error as try-catch used for exception handling");
        Thread.sleep(5000);
        System.out.println("after sleep");

    }
}
