package main.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class ArrayList3 {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();

        ArrayList array2 = new ArrayList<>();
        array2.add("test2");
        array2.add("test");
        array2.add("test3");
        System.out.println("Array 2 is "+ array2);

        ArrayList<String> array3 = new ArrayList<String>();
         array3.add("test");
        array3.add("test3");
        array3.add("test1");
        array3.add("test2");

        System.out.println("Array 3 is "+ array3);
        System.out.println(array3.size());
        System.out.println(array3.get(3));

        array3.retainAll(array2);
        System.out.println(array3);
    }
}
