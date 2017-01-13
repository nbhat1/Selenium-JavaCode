package main.java.returnType;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 */
public class ReturnType2 {
    void test1(){
        System.out.println("Method have void return type");
    }

    int test2(int a){
        System.out.println("This method is returning integer value");
        return a;
    }

    boolean test3(){
        System.out.println("This method is returning boolean value");
        return true;
    }

    ReturnType2 test4(){
        System.out.println("This method is returning class type");
        return this;
    }

    char test5(){
        System.out.println("This method is returning character value");
     return 'c';
    }

    double test6(int a, int b){
        System.out.println("This method is returning double value");
        return a+b;
    }

    public static void main(String[] args) {
        ReturnType2 obj = new ReturnType2();
        obj.test1();
        int var2= obj.test2(5);
        boolean var3 =obj.test3();
        ReturnType2 var4 = obj.test4();
        System.out.println(var4.getClass());



    }
}
