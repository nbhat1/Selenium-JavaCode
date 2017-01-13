package main.java.collection.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 * https://www.youtube.com/watch?v=LisvxFQuWvg&list=PL5NG-eEzvTti_6UYQm0g2HdtLqLYgRwbp&index=8
 */
public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer,String>();

        hashMap.put(1,"Test2");
        hashMap.put(2,"Test2");
        hashMap.put(1,"Test2"); // duplicate records will be ignored.
        hashMap.put(1,"Test3");
        hashMap.put(2,"Test4");
        hashMap.put(null,"Test4");

        /*System.out.println(hashMap);
        System.out.println(hashMap.get(2));*/

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> itr = keySet.iterator();
        // Get all values
        while(itr.hasNext()){
            System.out.println("Value in Key value pair is --> " + hashMap.get(itr.next()));
        }
        for(Map.Entry<Integer,String> entry:hashMap.entrySet()){ // type of entry variable is Entry<K,V>
            //System.out.println("Key value pair is " + entry);
            System.out.println(entry.getKey() + "--" + entry.getValue());

        }

    }
}
