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
public class SelectionSort 
{    
    
    public void selectSort(int[] array)
    {
        int min,temp,flag,index = 0;
        for(int i= 0; i < array.length; i++)
        {
            min = array[i];
            flag = 0;
            for(int j = i + 1; j < array.length; j++)
            {
                if (array[j] < min)
                {
                    min = array[j];
                    index = j;
                    flag = 1;
                }
            }
            
            if (flag == 1)
            {
                temp = array[i];
                array[i] = min;
                array[index] = temp;
            }
            
            printArray(array);
        }
        
    }
    
    
    public void printArray(int[] array)
    {
        for(int i= 0; i < array.length; i++)
        {
            System.out.printf("%d  ", array[i]);
        }
        System.out.println();
        
        int x = 5, y = 2;
        
        if (x > 5)
            if (y > 5)
                System.out.println("Hello");
        else
                System.out.println("Wrong");
                
    }
    
}
