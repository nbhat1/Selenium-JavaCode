package main.java.StringHandling;

/**
 * Created by neeraj.bhatnagar on 1/10/2017.
 */
public class String4 {
    public static void main(String[] args) {
        String p1 = "Neeraj";
        String p2 = "NEERAJ";

        System.out.println(p1.equals(p2));
        System.out.println(p1.equalsIgnoreCase(p2));

        String p3 = "Test";
        String p4 = "TEST";

        System.out.println(p3.equals(p4));
        System.out.println(p3.equalsIgnoreCase(p4));

        String p5 = "java";
        String p6 = "java";

        System.out.println(p5.equals(p6));
        System.out.println(p5.equalsIgnoreCase(p6));
    }
}
