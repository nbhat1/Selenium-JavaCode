package main.java.mehodOevrriding;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 * https://www.youtube.com/watch?v=5MsuIjCBpec&index=2&list=PL5NG-eEzvTtjgnePQAx0i3iY0E3itpqdr
 *
 */
public class MethodOverriding3 extends MethodOverriding1{
    /*public void test1(){
        System.out.println("I am from child class 3");
    }*/

    public static void main(String[] args) {
        MethodOverriding1 obj = new MethodOverriding3();
        obj.test1();

        /**
         * Java first check method in child class if method is not available in clhild class it will check for parent class.
         * In this example we have commneted method of child class so method of parent class is called.
         */
    }
}
