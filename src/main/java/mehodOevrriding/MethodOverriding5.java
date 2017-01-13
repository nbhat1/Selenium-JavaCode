package main.java.mehodOevrriding;

/**
 * Created by neeraj.bhatnagar on 1/8/2017.
 */
public class MethodOverriding5 extends  MethodOverriding4{
    public void sum(int a , int b){
        int c = a+b;
        System.out.println("Sum is from child 2 argument- " + c );
    }

    public void sum(int a , int b, int c){
        int d = a+b+c;
        System.out.println("Sum is from child 3 argument- " + d );
    }

    public void multiple(int a , int b){
        int c = a*b;
        System.out.println("Product is from child - " + c );
    }

   public void test4(){
       System.out.println("I am from child class");
   }

    /**
     * At run time method will me called based on the class for which we have created object.
     */
    public static void main(String[] args) {
        MethodOverriding4 obj = new MethodOverriding5();
        /**
         * if you make reference of parent class than we cant only methods of parent class. To access memebers of child class you have to make reference of child class.
         */
        obj.sum(5,5);
        obj.sum(3,3,3);
        obj.multiple(5,5);
        /**
         * Creating reference of child class in order to access all members of child class as well as prarent class.
         * If you make reference of child class you can access all methods of child class & parent class
         */


        MethodOverriding5 obj1 = new MethodOverriding5();
        System.out.println("********************************************************************");
        obj1.sum(3,3,3);
        obj1.multiple(5,5);
        obj1.sum(5,5);
        obj1.test4();


    }
}
