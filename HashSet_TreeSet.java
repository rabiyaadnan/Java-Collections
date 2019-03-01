/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset_treeset;

import java.util.HashSet; 
import java.util.TreeSet;

/**
 *
 * @author Bramerz
 */
public class HashSet_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        /*
        Source: https://www.geeksforgeeks.org/hashset-vs-treeset-in-java/
        */
        
        // Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("1"); 
        hset.add("2"); 
        hset.add("3"); 
        hset.add("4"); 
  
        // Duplicate removed 
        hset.add("2"); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        } 
        
        System.out.println();
        
        // Create a TreeSet 
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("1"); 
        tset.add("2"); 
        tset.add("3"); 
        tset.add("4"); 
  
        // Duplicate removed 
        tset.add("2"); 
  
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: "); 
        for (String temp : tset) { 
            System.out.println(temp); 
        } 
        
    }
    
}
