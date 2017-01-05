package main.java.abstractClass;

/**
 * Created by neeraj.bhatnagar on 12/7/2016.
 */
public class TestAbstractClass extends AbstractClass {
    @Override
    public void test2() {
        //System.out.println("I am test 2");

    }

    @Override
    public void test3() {
        //System.out.println("I am test 3");

    }

    public static void main(String[] args) {

      TestAbstractClass test = new TestAbstractClass();
        test.test3();
        test.test2();
        test.test1();

    }
}
