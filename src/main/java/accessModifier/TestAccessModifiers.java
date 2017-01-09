package main.java.accessModifier;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 */
public class TestAccessModifiers {
    public int a;
    int b;
    private int c;
    protected int d;

    public void test1(){
        System.out.println("I have public access");
        // Public class members can be access from any class in any package
    }

    void test2() {
        System.out.println("I have default access");
        // Default members can be accessed in any class witin pacakge using inheritance
    }
    private void test3(){
        System.out.println("I have private access");
        // Private members can be accessed within class only where they are declared.
    }
    protected void test4(){
        System.out.println("I have protected access");
        // Protected memebrs can be access within the package or outside package is using inheritence.
        // Difference between default & protected is that default members can be accessed only within package while protected members can be accessed from outside package.
    }

    public static void main(String[] args) {
        TestAccessModifiers obj = new TestAccessModifiers();
        obj.test1();
        obj.test2();
        obj.test3();
        obj.test4();
        // All members can be accessed within same class.
    }

    }

