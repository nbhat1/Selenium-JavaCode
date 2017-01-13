package main.java.StringHandling;

/**
 * Created by neeraj.bhatnagar on 1/10/2017.
 */
public class String5 {
    public static void main(String[] args) {

        /**
         * CompareTo function will compare two strings. If
         * s1== s2 : 0
         * s1 > s2 : positive value
         * s1 < s2 : negative value
         */

        String s1 = "Neeraj";
        String s2 = "neeraj";
        String s3 = "Bhatnagar";
        String s4 = "Kumar";
        String s5 = "Kumar";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        System.out.println("-------------------------------------------------------------");
        System.out.println(s4.compareTo(s5));
        System.out.println(s1.compareTo(s5));
        System.out.println(s4.compareTo(s1));





    }
}
