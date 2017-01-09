package main.java.mehodOevrriding;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 */
public class MethodOverriding2 extends MethodOverriding1 {
    public void test1(){
        System.out.println("I am from child class 2");
    }

    public static void main(String[] args) {
        MethodOverriding2 obj = new MethodOverriding2();
        obj.test1();
        /**
         * At run time method will me called based on the class for which we have created object.
         */
    }
}
