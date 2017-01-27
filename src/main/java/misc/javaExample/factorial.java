package main.java.misc.javaExample;

/**
 * Created by neeraj.bhatnagar on 1/27/2017.
 */
public class factorial {
    public static void main(String[] args) {

        int number = 5;
        int fact = 1;
        for (int i=1;i<=number;i++){
            fact = fact*i;
            System.out.println("Fact is "+ fact);
        }
        System.out.println("Final Fact is " + fact);
    }
}
