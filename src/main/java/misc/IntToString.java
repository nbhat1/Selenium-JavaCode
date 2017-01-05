package main.java.misc;

/**
 * Created by neeraj.bhatnagar on 1/2/2017.
 * This program converts Integer to String values.
 */
public class IntToString {
    public static void main(String[] args) {
        int s1 = 12;
        int s2 = 36;

        int s = s2+s1;
        System.out.println(s);

        // Convert String to Int.

        String s3 = String.valueOf(s1);
        String s4 = String.valueOf(s2);

        System.out.println(s3+s4);

    }
}
