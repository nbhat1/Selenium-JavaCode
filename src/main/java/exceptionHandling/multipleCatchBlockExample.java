package main.java.exceptionHandling;

/**
 * Created by neeraj.bhatnagar on 1/10/2017.
 */
public class multipleCatchBlockExample {

    public static void multiplecatchBlock(){

        try {
            int a[] = new int[5];
            a[8] = 30 / 1;
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Handled");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBound Exception handled");
        }catch(Exception e){
            System.out.println("Exception handled");
        }
        System.out.println("All exception handled");
    }

    public static void multiplecatchBlock_1(){
        int a[] = new int[5];
        a[5] = 30/0;

    }

    public static void main(String[] args) {
        multiplecatchBlock();
    }
}
