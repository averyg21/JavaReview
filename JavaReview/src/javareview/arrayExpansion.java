/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author Avery Grimes
 */
public class arrayExpansion {
    
    
    public void expansion()
    {
        
        int [] arr = {2,3,4,5,6,9,8,7,1,8};
        int [] original = new int [10];        
        

        //print original
        System.out.println("Original array:");
        printArray(original);

        //print arr array
        System.out.println("Arr array:");
        printArray(arr);

        //print new original
        System.out.println("New original array:");
        original = arr;
        printArray(original);

        //make arr length 12 now.
        System.out.println("Arr now length 12:");
        arr = new int [12];
        printArray(arr);
        
        //fill new arr with original array data
        System.out.println("Filling new length 12 arr with data.");
        for ( int counter = 0; counter < original.length; counter++)
        {
            arr[counter] = original[counter];
        }
        printArray(arr);
        
        
        //print new original
        System.out.println("Original array:");
        printArray(original);

        original = null;
        
        System.out.println("Printing null original array:");
        //Cant print null array with the print method
        //Just use the regular system print
        //printArray(original);
        System.out.print(original);
        System.out.println();
        
    }
    
    public void printArray(int[] array)
    {
        for ( int counter = 0; counter < array.length; counter++)
        {
            System.out.printf("%d ",array[counter]);            
        }
        System.out.println();
        System.out.println();
        
    }
    
}
