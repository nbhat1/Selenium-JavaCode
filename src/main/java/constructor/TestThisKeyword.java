package main.java.constructor;

/**
 * Created by neeraj.bhatnagar on 12/6/2016.
 * https://www.youtube.com/watch?v=qIIQIvs4abw&index=1&list=PL5NG-eEzvTtg_A5BXoZZYGXCPw7B6Hieh
 */
public class TestThisKeyword {
    int a;
    int b ;
    int c;
    static int d;

    // Constructors.
    public TestThisKeyword(){
        System.out.println("I am default constructor");
    }

    public TestThisKeyword(int a, int b){
        this(); // This is calling default constructor
        this.a = a;
        this.b= b;
        //this.d is not possible as this only works for current class non static members.
    }

    public TestThisKeyword(int a , int b , int c) {
        this(a,b); // This is calling constructor with 2 argument.
        this.c = c;
    }

    void display(){
        System.out.println("Value of a , b , c is == >" + a+"," + b + "," + "c");
    }

    public static void main(String[] args) {

        TestThisKeyword obj = new TestThisKeyword(2,3,4); // values to be provided in parametrize constructor
        obj.display();
    }


}
