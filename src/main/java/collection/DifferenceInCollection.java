package main.java.collection;

/**
 * Created by neeraj.bhatnagar on 1/11/2017.
 * https://www.youtube.com/watch?v=jlfG2wDwhwU&list=PL5NG-eEzvTti_6UYQm0g2HdtLqLYgRwbp&index=4
 */
public class DifferenceInCollection {

    /**
     ----arrayList
     arrayList internally uses dynamic array to store the elements.
     ----linkedList
     linkedList internally uses doubly linked list to store the elements.

     ----arrayList
     Manipulation with arrayList is slow because it internally uses array.
     If any element is removed from the array, all the bits are shifted in memory. lets say we are adding/removing element from 5th location so all objects will shift to fill the gap.
     While retrieval of data is fast as yo just have to give index of item array.get95]
     ----linkedList
     Manipulation with linkedList is faster than arrayList because it uses doubly linked list so no bit shifting is required in memory.
     since linked list uses doubly linked list so data insertion is fast as data will be inserted on head. But data retrieval is slow as header has to do head.next multiple times to go to object & remove it.
     Data removal is fast in linkedList aswe hjust hav eto remove reference of object.

     ----arrayList
     arrayList class can act as a list only because it implements List only.
     ----linkedList
     linkedList class can act as a list and queue both because it implements List and Deque interfaces.

     ----arrayList
     arrayList is better for storing and accessing data.
     ----linkedList
     linkedList is better for manipulating data.

     ----
     */
}
