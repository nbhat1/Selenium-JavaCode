package main.java.returnType;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 * https://www.youtube.com/watch?v=lTK7p8OKMxo&index=1&list=PL5NG-eEzvTtgCkLS9UHE5to2PdmySlSKl#t=150.170666
 */
public class ReturnType1 {
    public void test1(){
        System.out.println("Method with void return type");
    }

    public ReturnType1 test2(){
        //This method is returning a class type because return type is "ReturnType1" which is class type.
        System.out.println("This method have class type return");
        return (new ReturnType1());
    }

    public ReturnType1 test3(int a){
        //return a; // Since a is integer & return type of this method is ReturnType1
        return this; // this will return current class.
    }
    public ReturnType1 test4(){
       return new ReturnType1();
    }

    public int test5(){
        int x = 5;
        return x;
    }

    public static void main(String[] args) {
        ReturnType1 obj = new ReturnType1();
        ReturnType1 var1 = obj.test3(5); // Var is type if class name as this method is returning class type.
        System.out.println("Class Name is "+ var1.getClass());
        int var2 = obj.test5();
        System.out.println("value is" + var2);
        obj.test1();
        ReturnType1 var3 = obj.test2();
        System.out.println("value is - "+ var3.getClass());
    }
}

