package main.java.exceptionHandling;

import org.testng.annotations.Test;

/**
 * Created by neeraj.bhatnagar on 1/10/2017.
 */
public class TryCatch {
    /**
     * try block must be followed by either catch or finally block.
     * the code that might throw an exception.
     *
     * catch block is used to handle the exception. It must be used after the try block only.
     * we can use multiple catch block with a single try.
     */

    public void syntex(){
        try {

        }catch(Exception e){

        }
    }

    public static void arithmeticException(){
        int a = 9/0;
    }

    /**
     * Handling exception
     */
    public static void arithmeticExceptionHandling(){
        try {
            int a = 9 / 0;
        }catch (ArithmeticException e){
            System.out.println("Code is running fine");
           // e.printStackTrace();
        }
        System.out.println("Code after catching exception");
    }

    public static void main(String[] args) {
        arithmeticExceptionHandling();
    }

}
