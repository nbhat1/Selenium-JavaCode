package main.java.constructor;

/**
 * Created by neeraj.bhatnagar on 12/5/2016.
 */
public class TestConstructor {

    int a; // Instance variable or global variable or class variable.
    int b;
    int c;


    TestConstructor(){
        System.out.println("I am default constructor");
    }

    // Parametrize constructor
    TestConstructor(int a ){
        this.a = a; // Parametrize constructor is initializing instance variable.
        System.out.println("I am paarmetrize  constructor");
        System.out.println("I am Integer  constructor");
    }

    TestConstructor(String a){
        System.out.println("I am string constructor");
    }

   /* Paramaetriize constyructor with same argument are not allowed.
   TestConstructor (int b){

    }
    */

    /*  Parametrize constructor with different argument are allsowe.
    TestConstructor (int a , String b){

   }*/

    TestConstructor(int a , int b , int c) { // Local variable.
        this.a = a; //Global variable are mappped to local variable. Instance variable are initialized by local variable.
        this.b = b;
        this.c = c;
    }
    void diaplay(){
        System.out.println("Value of a, b, c is :- " + a + " " + b + " " + c);
        System.out.println(a);
    }
    void sum(){
        int d  = a+b+c;
        System.out.println("sum of two number is :-" + d);
    }

    public static void main (String[] args){

        /*
        Whenever we craete object of class we create object of constructor. If no constuctor is defined we create object of default constructor.
         */
        //TestConstructor obj = new TestConstructor();
        //TestConstructor obj1 = new TestConstructor(5);
        TestConstructor obj2 = new TestConstructor(5,12,15);
        TestConstructor obj3 = new TestConstructor("Hello");


        //obj.diaplay();
        //obj1.diaplay();
        obj2.diaplay();
        //obj2.sum();
        obj3.diaplay();

    }

}

