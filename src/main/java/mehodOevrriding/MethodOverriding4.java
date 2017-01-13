package main.java.mehodOevrriding;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 */
public class MethodOverriding4 {
    public void sum(int a , int b){
        int c = a+b;
        System.out.println("Sum is from parent 2 argument - " + c );
    }

    public void sum(int a , int b, int c){
        int d = a+b+c;
        System.out.println("Sum is from parent 3 argument - " + d );
    }

    public void multiple(int a , int b){
        int c = a*b;
        System.out.println("Product is from parent - " + c );
    }
}
