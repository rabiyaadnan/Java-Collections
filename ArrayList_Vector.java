/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */   

package arraylist_vector;

import java.io.*; 
import java.util.*; 

/**
 *
 * @author Bramerz
 */
public class ArrayList_Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        /*
            Source: https://www.geeksforgeeks.org/vector-vs-arraylist-java/
        https://www.geeksforgeeks.org/arraylist-in-java/
        
        */
        
        //System.out.println("ArrayList");
        
        // creating an ArrayList 
        ArrayList<String> al = new ArrayList<String>(); 
  
        // adding object to arraylist 
        al.add("1"); 
        al.add("2"); 
        al.add("3");  
  
        // traversing elements using Iterator' 
        System.out.println("ArrayList elements are:"); 
        Iterator it = al.iterator(); 
        while (it.hasNext()) 
            System.out.println(it.next()); 
        
        // size of ArrayList 
        int n = 5; 
  
        //declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
  
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" "); 
        
        
        System.out.println();
        //System.out.println("Vector");
  
        // creating Vector 
        Vector<String> v = new Vector<String>(); 
        v.addElement("1"); 
        v.addElement("2"); 
        v.addElement("3"); 
  
        // traversing elements using Enumeration 
        System.out.println("\nVector elements are:"); 
        Enumeration e = v.elements(); 
        while (e.hasMoreElements()) 
            System.out.println(e.nextElement());   
        
    }
    
}
