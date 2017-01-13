package main.java.StringHandling;

/**
 * Created by neeraj.bhatnagar on 1/9/2017.
 */

/**
 * Convert Character Array to String.
 */
public class String1 {
    public static void main(String[] args) {
        String s1= "Neeraj";
        String s2 = "Neeraj Bhatnagar";
        String s3 = "Neeraj Kumar Bhatnagar";
        //Converting char array to String
        char ch[] ={'n', 'e', 'e', 'r', 'a','j'};
        String s4 = new String(ch);
        char ch1[] ={'k', 'u', 'm', 'a', 'r'};
        String s5 = new String(ch1);
        char ch2[] ={'b', 'h', 'a', 't', 'n','a','g','a','r'};
        String s6 = new String(ch);
        String s7 = new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

    }
}
