/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Avery
 */
public class Recursion 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Recursion recur = new Recursion();
       String s = "ZERFOREZ";
       String f = "helfpe";
       recur.isPal(s);
//        recur.isPal(f);
        
//        recur.fact(4);
        
        //recur.fibonacci(5);
        
        
    }
    
    public boolean isPal(String s)
    {
        if (s.length() == 0 || s.length() == 1)
        {
            System.out.println("\nIs a Palindrome.");
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1))
        {
            System.out.println("Still searching.");
            return isPal(s.substring(1, s.length() - 1));
        }
        
        System.out.println("\nNot a Palindrome.");
        return false;
    }
    
    public int fact (int n)
    {
        int result;
        
        if (n == 1)
        {
            return 1;
        }
        
        result = fact(n-1) * n;
        System.out.println(result);
        return result;
    }
                
    }
    
}
