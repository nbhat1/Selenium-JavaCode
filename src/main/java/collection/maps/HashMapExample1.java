package main.java.collection.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class HashMapExample1 {
    public static void main(String[] args) {
       HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(50, "50");
        hashMap.put(51, "60");
        hashMap.put(52, "70");
        hashMap.put(53, "80");
        hashMap.put(54, "90");
        Set<Map.Entry<Integer, String>> entry = hashMap.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = entry.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next().getKey());
            //System.out.println(itr.next().getValue());

        }
    }
}
