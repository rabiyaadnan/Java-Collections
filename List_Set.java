/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list_set;

import java.util.*;

/**
 *
 * @author Bramerz
 */
public class List_Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Source:https://www.geeksforgeeks.org/list-interface-java-examples/
        https://www.geeksforgeeks.org/set-in-java/
        
        */
        
        System.out.println("List");
        
        // Creating a list 
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  // adds 1 at 0 index 
        l1.add(1, 2);  // adds 2 at 1 index 
        System.out.println(l1);  // [1, 2] 
  
        // Creating another list 
        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
  
        // Will add list l2 from 1 index 
        l1.addAll(1, l2); 
        System.out.println(l1); 
  
        // Removes element from index 1 
        l1.remove(1);      
        System.out.println(l1); // [1, 2, 3, 2] 
  
        // Prints element at index 3 
        System.out.println(l1.get(3)); 
  
        // Replace 0th element with 5 
        l1.set(0, 5);    
        System.out.println(l1);  

        System.out.println();
        System.out.println("Set");
        
        // Set deonstration using HashSet 
        Set<String> hash_Set = new HashSet<String>(); 
        hash_Set.add("Hello"); 
        hash_Set.add("World"); 
        hash_Set.add("1"); 
        hash_Set.add("2"); 
        hash_Set.add("3"); 
        System.out.print("Set output without the duplicates"); 
  
        System.out.println(hash_Set); 
  
        // Set deonstration using TreeSet 
        System.out.print("Sorted Set after passing into TreeSet"); 
        Set<String> tree_Set = new TreeSet<String>(hash_Set); 
        System.out.println(tree_Set); 

        
    }
    
}
