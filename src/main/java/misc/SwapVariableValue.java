package main.java.misc;

import org.testng.annotations.Test;

import java.util.Scanner;

/**
 * Created by neeraj.bhatnagar on 1/6/2017.
 */

public class SwapVariableValue {
    public static void main(String[]args){
    int x = 10;
    int y = 20;
        int tmp = 0;

        /**
         * Without additional variable
         * x = x+y;
        System.out.println("New x is :-" + x );

        y = x-y;
        System.out.println("New y is :-" + y );
        x = x-y;
        System.out.println("Final X is :-" + x );

        System.out.println(x);
        System.out.println(y);*/
        // Using extra variable.
        tmp = tmp +x;
        x=y;
        y = tmp;
        System.out.println(x);
        System.out.println(y);


}


}
