package main.java.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 */
public class ArrayList1 {

    /**
     * Common methods in Collection.
     public boolean add(Object element)	is used to insert an element in this collection.
     public boolean addAll(Collection c)	is used to insert the specified collection elements in the invoking collection.
     public boolean remove(Object element)	is used to delete an element from this collection.
     public boolean removeAll(Collection c)	is used to delete all the elements of specified collection from the invoking collection.
     public boolean retainAll(Collection c)	is used to delete all the elements of invoking collection except the specified collection.So all matching data in both of collection will reatin while other willbe deleted.
     public int size()	return the total number of elements in the collection.
     public void clear()	removes the total no of element from the collection.
     public boolean contains(Object element)	is used to search an element.
     public boolean containsAll(Collection c)	is used to search the specified collection in this collection.
     public IteratorExample iterator()	returns an iterator.
     public Object[] toArray()	converts collection into array.
     public boolean isEmpty()	checks if collection is empty.
     public boolean equals(Object element)	matches two collection.
     public int hashCode()	returns the hashcode number for collection.
     */

    public static void main(String[] args) {
        List array = new ArrayList<>();
        // Addingg elements in array list.
        array.add(5); // since 5 is integer value & add method add object instead of any premitive data type so java internaly uses array.add(Integer.valueof(5)).
        array.add(Integer.valueOf(5));
        array.add(2,4);
        array.add("String");
        array.add(String.valueOf("String"));
        array.add("true"); //array.add(Boolean.valueof(tue));
        array.add(Boolean.valueOf(false));
        array.add(3, Character.valueOf('c'));
        System.out.println(array.size());
        System.out.println(array);
        //remove array from array list
        array.remove(5);
        System.out.println(array);
        System.out.println(array.size());

        // Eample of array

        int[] array1 = new int[4];
        array1[0] = 4;
        //array1[1] = "String";      Different data types are not allaowed in array.

    }

}
