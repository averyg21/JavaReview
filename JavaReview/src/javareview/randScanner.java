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
import java.util.Scanner;
import java.util.Random;

public class randScanner {
    
    
    //problem 2 for random & scanner
    public void add()
    {
        //create objects for random and scanner
        Random randValue = new Random();
        Scanner input = new Scanner(System.in);
        
        //initialize num1,num2,randomNum (holds random number)
        //and total
        int num1;
        int num2;
        int randomNum;
        int total;
        
        //put random number into 
        randomNum = randValue.nextInt(10);
        
        //Ask for user input from user
        //output random number and input
        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();
        System.out.printf("The random num is: %d%n", randomNum);
        
        total = num1 + num2 + randomNum;
        
        System.out.printf("The total is: %d%n", total);
        
        
        
    }
    
}
