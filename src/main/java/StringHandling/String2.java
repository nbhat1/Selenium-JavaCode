package main.java.StringHandling;

/**
 * Created by neeraj.bhatnagar on 1/9/2017.
 */
public class String2 {

    public static void main(String[] args) {
        String s = "Neeraj";
        s.concat("kumar");
        s.concat("Bhatnagar");
        System.out.println(s);


        String s1 = "test";
        s1= s1.concat("test1");//Reference of object changed.
        System.out.println(s1);

        String s2= "run";
        s2 = s2.concat("test"); //Reference of object changed.
        System.out.println(s2);

        String s3 = "neeraj";
        String s4 = "Kumar";
        System.out.println(s1+s2);

    }
}
