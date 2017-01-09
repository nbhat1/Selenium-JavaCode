package main.java.accessModifier;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 * Test Access Modifier without Inheritance
 */
public class TestAccessModiifer2 {
    public static void main(String[] args) {
        TestAccessModifiers obj = new TestAccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);   // Private members are not accessing.
        System.out.println(obj.d);
        obj.test1();
        obj.test2();
        obj.test4();


    }

}
