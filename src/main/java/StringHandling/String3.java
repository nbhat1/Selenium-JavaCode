package main.java.StringHandling;

/**
 * Created by neeraj.bhatnagar on 1/9/2017.
 */
public class String3 {
    public static void main(String[] args) {
        String s1 = "Neeraj";
        String s2 = "Kumar";
        String s3 = "Bhatnagar";
        String s4 = new String("Neeraj");
        String s5 = "Kumar";

        /**
         * String equals() method compares the original conten of the String.
         */
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s5));

        /**
         * String == operator compares the reference of the String.
         */
        String s6 = "Neeraj";
        String s7 = "Neeraj";
        String s8 = new String("Neeraj");
        String s9 = new String ("Neeraj");
        System.out.println(s6 == s7);       // Will return true as reference is same as both of string are creates using String literal.
        System.out.println(s6 == s8);
        System.out.println(s7 == s8);
        System.out.println(s8 == s9);
        System.out.println(s6.equals(s8));
        System.out.println(s1 == s6);
    }
}
