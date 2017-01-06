package main.java.misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by neeraj.bhatnagar on 1/6/2017.
 */
public class DuplicateCharacterInString {
    String s = "NeerajKumarBhatnagar";
    public void findDuplicateValuesInString(String str){
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        for(Character ch:chars){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch)+1);
            } else {
                charMap.put(ch,1);
            }
        }

    }

}
