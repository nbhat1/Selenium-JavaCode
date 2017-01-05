package main.java.abstractClass;

/**
 * Created by neeraj.bhatnagar on 12/7/2016.
 * Method test2() is implemenetd in Class B so it need not to be implemenetd in Class C
 */
public class C extends B {
    @Override
    public void test1() {

    }

    @Override
    public void test3() {

    }

    public static void main(String[] args) {
        C obj = new C();
        obj.test2();
        obj.test1();
    }
}
