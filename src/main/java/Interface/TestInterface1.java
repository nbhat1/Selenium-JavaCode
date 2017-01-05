package main.java.Interface;

/**
 * Created by neeraj.bhatnagar on 12/6/2016.
 */
public  class TestInterface1 implements InterfaceExample,InterfaceExample2{

    public void classMethod(){
        System.out.println("i AM METHOD OF CLASS");
    }

    @Override
    public void test4() {
        System.out.println("Test 4");

    }

    @Override
    public void test1() {
        System.out.println("Test 1");

    }

    @Override
    public void test2() {
        System.out.println("Test 2");

    }

    @Override
    public void test3() {
        System.out.println("Test 3");

    }

    public static void main(String[] args) {

        TestInterface1 obj = new TestInterface1();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.classMethod();

        InterfaceExample obj1 = new TestInterface1(); // We can reate reference of interface for class exteding Interface wbut can not use methods of class itself. classMethod can not be called with obj1
        obj1.test1();
        obj1.test2();
        obj1.test3();
    }

}

