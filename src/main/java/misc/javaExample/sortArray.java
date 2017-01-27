package main.java.misc.javaExample;

import java.util.Arrays;

/**
 * Created by neeraj.bhatnagar on 1/27/2017.
 */
public class sortArray {
    public static void main(String[] args) {
        int a[]= {2,5,3,6,7,4,9};
        for (int number :a){
            System.out.println("Number "+ number);
        }

        Arrays.sort(a);
        for (int number1 :a){
            System.out.println("Sorted Number "+ number1);
        }
    }
}
