package main.java.collection.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by neeraj.bhatnagar on 1/12/2017.
 */
public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        treeMap.put(3, "test3");
        treeMap.put(1, "test1");
        treeMap.put(2, "test2");
        treeMap.put(4, "test4");
        //treeMap.put(null, "test4"); // Null values are not allowed.

        System.out.println(treeMap); // Data will eb displayed in ascending order based on key.

        Set<Map.Entry<Integer, String>> treeMap1 = treeMap.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = treeMap1.iterator();


        while(itr.hasNext()){
            System.out.println(itr.next().getKey());

        }


    }
}
