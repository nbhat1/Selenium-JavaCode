package main.java.mehodOevrriding;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 * Method overriding by changing return type
 */
public class MethodOverriding7 extends MethodOverriding6{
    public int add(){
        System.out.println("I am from child class");
        return 5;
    }

    public void add1(int a,int b, int c){
        System.out.println("I am from child class");

    }

    public static void main(String[] args) {
        MethodOverriding7 obj = new MethodOverriding7();
        obj.add1(4,4);

    }


}
