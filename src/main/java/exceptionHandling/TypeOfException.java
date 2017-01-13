package main.java.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by neeraj.bhatnagar on 1/10/2017.
 */
public class TypeOfException {
    static String s1;

    public static void arithmeticException(){
        int a = 9/0;
    }

    public static void nullPointerException(){
        System.out.println(s1.concat("Test"));
    }

    public static void stackOverFlow(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(true){
            array.add(10);
        }
    }

    public static void numberFormatException(){
        String s1 = "Test";
        int t = Integer.parseInt(s1);
    }

    public static void fileNotFoundException() throws FileNotFoundException {
        FileReader f = new FileReader("C://Test/xls");
    }

    public static void classNotFoundException() throws ClassNotFoundException {
        Class.forName("Test");
    }

    public static void illegalArgumentException(int b){
        int a = b + b;
    }

    public static void arrayIndexOutOfBound(){
        int[] a = new int[5];
        System.out.println(a[6]);
    }

    public static void outOfMemoryException(){
        long data[]=new long[1000000000];
    }



    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        /*arithmeticException();
        nullPointerException();
         stackOverFlow();
         numberFormatException();
         fileNotFoundException();
         classNotFoundException();
         arrayIndexOutOfBound();
         outOfMemoryException();
       */
        outOfMemoryException();




    }

}
