package main.java;

/**
 * Created by neeraj.bhatnagar on 1/12/2017.
 */
public class WrapperClass {
    public static void main(String[] args) {

        //Primitive data types in java.
        boolean data;
        int data1;
        double data2;
        char data3;
        short data4;
        long data5;
        float data6;
        byte data7;


        data = true;

        Boolean a = Boolean.valueOf(data);
        Boolean b = data;
        System.out.println(a+ " " + b);

    }
}
