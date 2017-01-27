package main.java.misc;

/**
 * Created by neeraj.bhatnagar on 1/25/2017.
 */
public class printTable {
    public static void main(String[] args) {

        for (int i=2; i<=3 ;i++ ){
            System.out.println("value of i is "+i);
            for (int j=1;j<=10;j++){
            System.out.println("value of j is "+j);
                //System.out.println(i*j);
                System.out.println(i + "*"+ j + "=" + (i*j));
            }

        }

    }
}
