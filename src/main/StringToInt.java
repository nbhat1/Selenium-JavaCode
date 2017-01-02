package main;

/**
 * Created by neeraj.bhatnagar on 1/2/2017.
 */
public class StringToInt {
    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "34";
        String s = s1+s2;
        System.out.println(s);

        System.out.println(s.substring(0,1));
        System.out.println(s.substring(0,4));

        int s3 = Integer.parseInt(s1);
        int s4 = Integer.parseInt(s2);
        int S = s3 + s4;
        System.out.println("Sum = " + S);
    }


}
