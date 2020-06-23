package collections.listInterface;

import java.util.ArrayList;
import java.util.Collections;   //Collection's sort() function is used to sort an collections.arrayList
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("saxena");
        s.add("ashish");
        s.add("ash");
        s.add("ashi");
        Collections.sort(s);
        System.out.println(s);
        List<String> toRemove= new ArrayList<>();
        toRemove.add("ashi");
        toRemove.add("ash");
        s.removeAll(toRemove);

        String temp[] = new String[s.size()];
        Object Arr = s.toArray(temp);
        for(String i : temp)
            System.out.print(i+ " ");


////_______________________GENERIC CLASS USE EXAMPLE____________________________________________________________________
//        GenericClass<Integer,Float> pair = new GenericClass(21,21f);
//
//        pair.getDescription();
//        ArrayList<Integer> a = new ArrayList();

//______________________________________________________________________________________________________________________
/*______________________________________________________________________________________________________________________

//  Creating an ArrayList
        ArrayList<Integer> a = new ArrayList();
//  Adding elements :    arrayListObject.add(value);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
//  For-each loop
//        for(Object i:a)
//            System.out.println(i);

//  Adding element at index i   :   arrayListObject.add( index, value);
        a.add(2,100);

//  Modifying value at index i  :   arrayListObject.set( index, value);
        a.set(0,-1);

        System.out.println(a+ " is an ArrayList");

//  Removing element from index i   :   arrayListObject.remove( index);
        a.remove(3);

        System.out.println(a+ " is an ArrayList after removing element from index 3");
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i) + " is element at index "+ i);

//  Remove all elements     :   arrayListObject.clear();

//  Size of collections.arrayList   :   arrayListObject.size();
        System.out.println(a.size());

//  Sorting an collections.arrayList    :   ArrayList is a collection, so we use Collections.sort(arrayListObject) to sort it.
        Collections.sort(a);
        System.out.println(a);

_____________________________________________________________________________________________________________________ */
    }
}
