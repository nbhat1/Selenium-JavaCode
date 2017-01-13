package main.java.collection.linkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class LinkedList1 {

    public static void main(String[] args) {

        List linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add("test");
        linkedList.add(true);
        linkedList.add(5.1);

        System.out.println(linkedList.size());
        System.out.println(linkedList);
        System.out.println(linkedList.get(1)); // IndexOutOfBoundsException will be displayed if any object is get which is not present in object.

        linkedList.remove(true);
        System.out.println(linkedList);

        List linkedList1 = new LinkedList<>();
        linkedList1.add(5);
        linkedList1.add("test");
        System.out.println(linkedList.contains(5.1));
        System.out.println(linkedList.containsAll(linkedList1)); // containsAll method checks if all objects of one collection are available in other collection.

    }

}
