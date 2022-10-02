
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //vector v1 =new vector(int capacity,int increment);
        Vector v1 = new Vector(7,1);

        v1.add(0,"people");
        v1.add(1,"think");
        v1.add(2,"Java");
        v1.add(3,"and");
        v1.add(4,"Javascript");
        v1.add(5,"are");
        v1.add(6,"related");


        Vector v2 =new Vector(10);
        v2.add("Many");
        v2.addAll(1,v1);
        // all elements of v1 are added to v2
        System.out.println("Vector is " + v2);

        // v2 is cloned to clone
        Vector clone = new Vector();
        clone =(Vector)v2.clone();
        System.out.println("the cloned vector is "+clone);

        // condition is checked for Javascript
        if (v1.contains("Javascript"))
            System.out.println("JavaScript exists");
        System.out.println("The default capacity of v2  is "+v2.capacity());

        //ensuring  capactiy of v2
        v2.ensureCapacity(25);
        // checking the capacity
        System.out.println("The new capacity of v2 is "+v2.capacity());


        //triming to size
        v2.trimToSize();
        System.out.println("The  capacity of v2 is "+v2.capacity());

        //getting the element at index 5
        System.out.println("the element at index 5 of v1 is "+v1.get(4));

        System.out.println("the  index  of javascript in v1 is "+v1.indexOf("Javascript"));


        //last index of
        System.out.println("the last index of related in v2 is "+v2.lastIndexOf("related"));

        System.out.println("first element of vector v1 is: " + v1.firstElement());

        //vector to string
        System.out.println("the string equivalent of vector ve is "+v2.toString());
        v2.remove(7);
        System.out.println("the vector after removal of index 7 is "+v2);
        // v2 is cleared
        v2.clear();
        System.out.println("the vector v2 after clearing is :"+v2);

        if(v2.isEmpty())
            System.out.println("the vector v2 is empty");


    }
}
