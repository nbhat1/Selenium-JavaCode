package main.java.Interface;

/**
 * Created by neeraj.bhatnagar on 12/6/2016.
 */
public interface InterfaceExample {

    public static final int i=5; // By default constants in interface are public static final.
    int j = 6;

    void test1();
    void test2();
    void  test3();

    public static void main(String[] args) {
        // InterfaceExample obj = new InterfaceExample(); Object of interface can not be created.
    }

}
