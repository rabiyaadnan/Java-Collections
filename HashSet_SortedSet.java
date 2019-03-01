/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset_sortedset;

import java.util.*; 
import java.util.SortedSet; 
import java.util.TreeSet;

/**
 *
 * @author Bramerz
 */
public class HashSet_SortedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Source:https://www.geeksforgeeks.org/sortedset-java-examples/
        https://www.geeksforgeeks.org/hashset-in-java/
        
        */
        
        System.out.println("HashSet");
        
        HashSet<String> h = new HashSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 

        System.out.println();
        System.out.println("SortedSet");
        
        
        // Create a TreeSet and inserting elements 
        SortedSet<String> sites = new TreeSet<>(); 
        sites.add("1"); 
        sites.add("2"); 
        sites.add("3"); 
        sites.add("4"); 
  
        System.out.println("Sorted Set: " + sites); 
        System.out.println("First: " + sites.first()); 
        System.out.println("Last: " + sites.last()); 
  
        // Getting elements before quiz (Excluding) in a sortedSet 
        SortedSet<String> beforeQuiz = sites.headSet("hello"); 
        System.out.println(beforeQuiz); 
  
        // Getting elements between code (Including) and  
        // practice (Excluding) 
        SortedSet<String> betweenCodeAndQuiz = 
                                  sites.subSet("hello","world"); 
        System.out.println(betweenCodeAndQuiz); 
  
        // Getting elements after code (Including) 
        SortedSet<String> afterCode = sites.tailSet("hello"); 
        System.out.println(afterCode); 
        
    }
    
}
