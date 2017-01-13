package main.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class ArrayList2 {

    public static void main(String[] args) {
        // Store only oen type of data. i.e. Store only Integer data.
        List<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(7);
        array.add(1,9);
        System.out.println(array);
        System.out.println(array.get(2));

        List<Integer> array1 = new ArrayList<Integer>();
        array1.add(10);
        array1.add(40);
        array1.add(50);
        System.out.println(array1);

        // addAll method added all object of one collection to other collection.
        array.addAll(array1);
        System.out.println("Array is "+array);

        array.removeAll(array1);
        System.out.println("Array after remove array1" + array);

        array1.addAll(array);
        System.out.println("Array1 is "+ array1);

        System.out.println(array1.contains(500));
        System.out.println(array1.contains(5));
        System.out.println(array1.containsAll(array1));

        /*array1.removeAll(array);
        System.out.println("Array1 after remove array" + array1);*/
    }



}
