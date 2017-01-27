package main.java.misc.javaExample;

/**
 * Created by neeraj.bhatnagar on 1/27/2017.
 */
public class smallestAandLargestNumberInArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

       int smallest = a[0];
        int largest = a[0];

        for (int i= 1; i<a.length;i++){
            if(a[i] > largest){
                largest = a[i];
                System.out.println("temporary laregest number is "+ largest );
            } else if(a[i] < smallest) {
                smallest = a[i];
                System.out.println("temporary smallest number is " + smallest);
            }
        }
        System.out.println("largets number is " + largest);
      System.out.println("smallets is "+ smallest);
    }
}
