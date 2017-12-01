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
public class Interest 
{
    private double rate = .06;
    private double principal = 2000.00;
    private double monthly = 500.00;
    
    //method for problem 1
    public void compoundRate()
    {
        
        //maybe rase intRate ^ year?
        for (int i = 0; i < 40; i++)
        {
            principal = (principal + (monthly * 12)) * (1 + rate);
            
            System.out.printf("Year %d total is: %.2f%n", i + 1, principal);
        }
        
        System.out.printf("Your total principal is: %.2f%n", principal);
    }
    
}
