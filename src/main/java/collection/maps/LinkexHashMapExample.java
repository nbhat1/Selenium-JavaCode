package main.java.collection.maps;

import java.util.*;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class LinkexHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();

        linkedHashMap.put(2,"test2");
        linkedHashMap.put(1,"test1");
        linkedHashMap.put(3,"test3");
        linkedHashMap.put(4,"test4");
        // Linked hashmap maintains data insertion order.
        System.out.println("hashmap maintain order - " + linkedHashMap);

        Set<Map.Entry<Integer, String>> entry = linkedHashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = entry.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getValue());
        }

        for(Map.Entry<Integer, String> entry1:linkedHashMap.entrySet()){
            System.out.println(entry1.getValue() + "--" + entry1.getKey());

        }


        //Hashmap doesnot maintain order of object insertion.
        HashMap<Integer,String> HashMap1 = new HashMap<Integer,String>();
        HashMap1.put(2,"test2");
        HashMap1.put(1,"test1");
        HashMap1.put(3,"test3");

        System.out.println("hashmap does not maintain order - " + HashMap1);


    }
}
