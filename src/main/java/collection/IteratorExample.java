package main.java.collection;


import java.util.*;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class IteratorExample {

    public static void main(String[] args) {
        /*Enumeration;
        IteratorExample;
        ListIterator*/

        Vector v = new Vector<>();

        v.add(5);
        v.add(6);
        v.add(7);

        Enumeration vector = v.elements();
        while(vector.hasMoreElements()){
            System.out.println(vector.nextElement());
        }

        ArrayList<Integer> array= new ArrayList<Integer>();
        array.add(3);
        array.add(4);

        Iterator<Integer> itr = array.iterator();
        while(itr.hasNext()){
            System.out.println("Array elements are "+itr.next());
            itr.remove();                   // This will remove first element of array
            System.out.println("Array element after removal are "+array);
        }

        System.out.println("--------------------------------------------");

        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(6);

        Iterator<Integer> itr1 = linkedList.iterator();
        while(itr1.hasNext()){
            System.out.println("LinkedList elements are "+itr1.next());
            itr1.remove();                   // This will remove first element of array
            System.out.println("LinkedList element after removal are "+linkedList);
        }

        System.out.println("------------------List Iterator--------------------------");

        LinkedList<Integer> linkedList1= new LinkedList<Integer>();
        linkedList1.add(7);
        linkedList1.add(8);

        ListIterator<Integer> itr2 = linkedList1.listIterator();
        while(itr2.hasNext()){
            System.out.println("LinkedList elements are "+itr2.next());
            //itr2.remove();                   // This will remove first element of array
            System.out.println("LinkedList element after removal are "+linkedList);
        }
        System.out.println(linkedList1);
        while(itr2.hasPrevious()){
            itr2.previous();
        }
        System.out.println(linkedList1);



    }
}
