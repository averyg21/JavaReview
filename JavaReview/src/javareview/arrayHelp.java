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
import java.util.Random;

public class arrayHelp {
    
    //not a problem on the review
    //initializes 1 array to length of 4
    //initializes another array with values 0-7
    //then prints the array2 backwards
    public void arrayHelp1()
    {
        int[] array1 = new int[4];
        int[] array2 = {0,1,2,3,4,5,6,7}; 
                
        System.out.println("Array 1:");
        for(int i = 0; i < array1.length; i++)
        {
            System.out.printf("%d ", array1[i]);
        }
        System.out.println();
        
        System.out.println("Array 2:");
        for(int i = 0; i < array2.length; i++)
        {
            System.out.printf("%d ", array2[i]);
        }
        System.out.println();
        
        System.out.println("Array 2 backwards:");
        for(int i = array2.length - 1; i >= 0; i--)
        {
            System.out.printf("%d ", array2[i]);
        }
        System.out.println();
        
        
        
    }
    
    //problem 1
    public void randomArray()
    {
        Random randValue = new Random();
        int[] randArray = new int [10];
        int total = 0, average, count = 0;
        
        for(int i = 0; i < randArray.length; i++)
        {
            randArray[i] = randValue.nextInt(10);
            total += randArray[i];
            count++;
        }
        
        /*
        //using an enhanced for loop to
        //count the total of the array
        for(int number : randArray)
        {
            total += number;
        }
        */
        
        
        average = total / count;
        printArray(randArray);
        
        System.out.printf("Total of array is: %d%n", total);
        System.out.printf("The array average is: %d%n", average);
        
        
    }
    
    //problem 2
    public void multiArray()
    {
        int[][] array3 = {{1,2,3},{4,5,6}};
        int[][] array4 = {{1,2}, {3}, {4,5,6}};
        
        System.out.println("Multi-array 1: ");
        printMultiArray(array3);
        int total1 = multiArrayTotal(array3);
        System.out.printf("Multi-Array total: %d%n", total1);
        
        System.out.println("Multi-array 1: ");
        printMultiArray(array4);        
        int total2 = multiArrayTotal(array4);
        System.out.printf("Multi-Array total: %d%n", total2);
    }
    
    
    public void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
    
    public void printMultiArray(int[][] array)
    {
        for(int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++)
            {
                System.out.printf("%d  ", array[row][column]);
                
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public int multiArrayTotal(int[][] array)
    {
        int total = 0;
        for(int row = 0; row < array.length; row++)
        {
            for (int column = 0; column < array[row].length; column++)
            {
                total += array[row][column];
            }
        }
        
        return total;
    }
    
    
}
