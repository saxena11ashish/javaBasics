package strings;

import java.sql.SQLOutput;

public class StringIntro {
    public static void main(String[] args) {
//        //String pool area : initialization by literal
//        String name ="ashi";
//        String name2="ashi";

//        //Heap area : initialization by object
//        String namee = new String("ashi");
//        System.out.println(name==namee);

        //In-built functions
        String name = "Ashish Saxena";
        System.out.println(name.length());
        System.out.println("charAt: " + name.charAt(4));
        System.out.println("indexOf: " + name.indexOf('x'));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("trimmedSize: " + "          ashish       ".trim().length());
        System.out.println(name.substring(4));  //beginning till last index
        System.out.println(name.substring(4,11));  //range
        System.out.println("contains(): " + name.contains("x")); //checks if string has a character sequence(substring), return true|false
        System.out.println("equals(): " + name.equals("Ashish Saxena"));  //checks if 2 strings are same or not,caseSensitive
        System.out.println("isEmpty: " + name.isEmpty());

        //concatenation can be done by concat() func or using + operator
        System.out.println(name = name.concat("425"));
        name+=14803116;
        System.out.println(name);
        System.out.println(name.replace('a','*'));

        // SPLIT FUNCTION
        // String.split("regular_expression")  ->  returns an array of strings
        String cars="i10,i20,i30,i40";
        String arr[] = cars.split(",");
        for(String i: arr)
            System.out.print(i + " ");


    }

}
