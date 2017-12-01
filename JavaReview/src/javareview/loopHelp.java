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
public class loopHelp {
    
    public void forLoop()
    {
        
        System.out.printf("%-10s%20s%n","Index","Even/Odd");
        for (int i = 0; i <= 20; i++)
        {
            System.out.printf("%-10d", i);
            if (i % 2 == 1)
            {
                System.out.printf("%20s%n", "Odd");
            }
            else
            {
                System.out.printf("%20s%n", "Even");
            }
        }
        System.out.println();
    }
    
    public void doWhileLoop()
    {
        //do-while
        //problem 3
        int counter = 6;
        
        do
        {
            System.out.printf("%d ", counter);
            counter++;
        } while (counter <= 5);
        System.out.println();
    }
    
    public void whileLoop()
    {
        //while loop
        //problem 4
        int index = 0;
        boolean flag = true;
        
        while (flag == true)
        {
            if (index > 20)
            {
                flag = false;
            }
            
            if(index % 2 == 0)
            {
                System.out.printf("%d ", index);
            }
            index++;
        }
        
        System.out.println();
    }
    
}
