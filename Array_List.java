/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_list;

import java.util.*; 

/**
 *
 * @author Bramerz
 */
public class Array_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
    
        /*
            Source: https://www.geeksforgeeks.org/arrays-in-java/
            https://www.geeksforgeeks.org/list-interface-java-examples/
        */
        
        System.out.println("Array");
        // declares an Array of integers. 
        int[] arr; 
          
        // allocating memory for 5 integers. 
        arr = new int[5]; 

        // initialize the first elements of the array 
        arr[0] = 10; 

        // initialize the second elements of the array 
        arr[1] = 20; 

        //so on... 
        arr[2] = 30; 
        arr[3] = 40; 
        arr[4] = 50; 

        // accessing the elements of the specified array 
        for (int i = 0; i < arr.length; i++) 
           System.out.println("Element at index " + i +  
                                        " : "+ arr[i]);     
        
        
        System.out.println();
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


    }
    
}
