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
public class methodClass {
    
    //Can call this method in main without creating an object
    //Just use the className.methodName
    //instance of the object will not have this method!!!
    public static void checkOutput(){
        System.out.println("Hello");
    }
    
    //multiple parameters initialize to certain
    //values unless changed by the user
    public int maximum(int x, int y, int z)
    {
        int max = x;
        if (y > max)
            max = y;
        
        if (z > max)
            max = z;
        
        return max;
    }
    
    //overloading methods... somewhat like passing in 
    //default arguments to the first maximum method
    public int maximum()
    {
        methodClass newMethod = new methodClass();
        return newMethod.maximum(2,10, 30);
    }
    
}
