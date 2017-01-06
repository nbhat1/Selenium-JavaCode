package main.java.misc;

/**
 * Created by neeraj.bhatnagar on 1/6/2017.
 * https://www.youtube.com/watch?v=7UTd4fWeVwA&list=PL5NG-eEzvTtj4ybYbBMk2Q2p6QQmv_xJn
 */
public class MethodOverloading {
    void test1(){
        System.out.println("I am method with no argument");
    }
    void test1(int a){
        System.out.println("I am method with one argument");
    }
    void test1(int a , int b){
        System.out.println("I am method with two argument");
    }
    // Method with argumnet as class type
    void test1(MethodOverloading a){
        System.out.println("I am method with one classtype argument");
    }
    void test1(MethodOverloading a , MethodOverloading b){
        System.out.println("I am method with two classtype argument");
    }
    void test1(int a, double b){
        System.out.println("I am method with int & double argument");
    }

    public static  void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.test1();
        obj.test1(5);
        obj.test1(5,10);
        obj.test1(obj);
        obj.test1(obj, obj);
        obj.test1(1, 1.5);
    }
}
