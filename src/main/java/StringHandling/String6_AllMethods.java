package main.java.StringHandling;

/**
 * Created by neeraj.bhatnagar on 1/10/2017.
 */
public class String6_AllMethods {
    public static void main(String[] args) {
        String s1 = "Neeraj";
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(0)); // Return character from staring based on index.

        System.out.println("-----------------------------------");
        System.out.println(s1.contains("raj"));
        System.out.println(s1.contains("n"));
        System.out.println(s1.contentEquals("ra"));
        System.out.println("------------------------------------");
        System.out.println(s1.concat(" Kumar"));
        System.out.println(s1.concat(" Bhatnagar"));
        System.out.println("-------------------------------------");

        String s2 = "Neeraj Kumar Bhatnagar";
        String s3 = "Neeraj Kumar Bhatnagar Bhatnagar1";
        String[] split =  s2.split(" "); // Splitting string base on space.
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println("---------------------------------------");

        String[] split1 = s3.split("Bhatnagar1");
        System.out.println(split1[0]);
        //System.out.println(split1[1]);
        //System.out.println(split1[2]);

        System.out.println("----------------------------------------");
        String s4 = "Neeraj";
        String s5 = "NEERAJ";
        String s6 = "Neeraj    ";
        String s7 = "Kumar";



        System.out.println(s4.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s6);
        System.out.println(s6.trim());  // Trim will remove all whitespaces.
        System.out.println(s6.concat(s7));
        System.out.println((s6.trim().concat(s7).concat(s4)));


    }
}
