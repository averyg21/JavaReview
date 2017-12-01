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
public class ifHelp {
    /*
    Problem 1: Create an if…elseif statement that outputs “number is small” if the number is less than or equal to five. 
    If the number is between 6 (inclusive) and 20 (exclusive) output “the number is average”. 
    If the number is greater than or equal to 20 output the number is “the number is large”.    
    */
    
    public void output(int num)
    {
        if (num <= 5)
        {
            System.out.println("Number is small");
        }
        else if (num >= 6 && num < 20 )
        {
            System.out.println("Number is average");
        }
        else
        {
            System.out.println("Number is large");
        } 
        
        /*
        Using switch statements
        */
    }
    
    //Problem 4 checking pass or fail with
    //ternary operator
    public void ternary()
    {
        /*
        using the ternary operator
        */
        int studentGrade = 70;
        System.out.println(studentGrade >= 60 ? "Passed":"Failed");
    }
    
    /*
    using switch statements to determine grade
    Switch statement problem 1 */
    
    public void switchStatement(int grade)
    {
        switch(grade / 10)
        {
            case 9:
            case 10:
                System.out.println("A");
                break;
            
            case 8:
                System.out.println("B");
                break;
                
            case 7:
                System.out.println("C");
                break;
                
            case 6:
                System.out.println("D");
                break;
                
            default:
                System.out.println("F");
                break;
        }
    }
    
}
