package collection;

import java.util.ArrayList;
import java.util.Collections;

public class IntroCollection {
    public static void main(String[] args){
        ArrayList<String> emps = new ArrayList<>();
        emps.add("java");
        emps.add("appu");
        emps.add("rakesh");
        Collections.sort(emps, (String a, String b) -> {
            if(a.length() > b.length()){
                return 1;
            }
            return -1;
        });

       System.out.println(emps.toString());

    }
}

/*
1. What is Collection in Java?
Definition (simple):
Collection is a framework in Java that provides classes and interfaces to store, retrieve, update, and delete groups of objects.
In simple words:
Collection = A group of objects stored together + methods to manage them.
Note:: It is collection not collections
Collection
   |
   |---- List
   |       |--- ArrayList
   |       |--- LinkedList
   |
   |---- Set
   |       |--- HashSet
   |       |--- TreeSet
   |
   |---- Queue
   |       |--- PriorityQueue
   |
   Map (separate from Collection)
        |--- HashMap
        |--- TreeMap
 */
