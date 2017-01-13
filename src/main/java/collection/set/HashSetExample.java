package main.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by neeraj.bhatnagar on 1/12/2017.
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set hashSet = new HashSet<>();

        hashSet.add(7);
        hashSet.add(7);
        hashSet.add("String");
        hashSet.add(8);
        hashSet.add(false);
        hashSet.add(7);

        System.out.println(hashSet); // HashSet removes duplicate values.

        // Iteration in set.

        Iterator itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
