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
import java.io.IOException;
public class JavaReview 
{

    public static void main(String[] args) throws IOException
    {
        //if, switch, ternary code help object
        ifHelp newIf = new ifHelp();        
        //holds the for loop and while loop object
        loopHelp newLoop = new loopHelp();        
        //random and scanner class
        randScanner scannerClass = new randScanner();        
        //methods objects
        methodClass newMethod = new methodClass();        
        //class object
        Student newStudent = new Student("Clark Kent",25,"Journalism");        
        //array object
        arrayHelp arrayClass = new arrayHelp();        
        //array expansion object
        arrayExpansion expansion = new arrayExpansion();        
        //compounding interest object
        Interest compoundInt = new Interest();        
        //selection sort
        SelectionSort select = new SelectionSort();
        
        /*
        //Help for if statement
        newIf.output(15);
        newIf.output(-100);
        newIf.ternary();
        newIf.switchStatement(80);
        */
        
        
        
        /*
        //while & do-while loop
        newLoop.forLoop();
        newLoop.doWhileLoop();
        newLoop.whileLoop();
        */
        
        
        /*
        //random & scanner help
        scannerClass.add();
        */
        
        
        /*
        //array help
        arrayClass.arrayHelp1();
        arrayClass.randomArray();
        arrayClass.multiArray();
        */
             
        
        /*
        //array expansion        
        expansion.expansion();
        */
        
        
        /*
        //**method help object** 
        //can call checkOutput() in methodClass without an object
        //because it is an static method, same with output1
        methodClass.checkOutput();
        output1();
        int max = newMethod.maximum();
        System.out.printf("The max is: %d%n", max);
        */
        
        
        
        
        /*
        System.out.printf("Student name is: %s%n", newStudent.getName());
        System.out.printf("Student age is: %d%n", newStudent.getAge());
        System.out.printf("Student major is: %s%n", newStudent.getMajor());
        newStudent.addAge();
        System.out.printf("Student age is: %d%n", newStudent.getAge());
        */
        
        
        
        
        /*
        //compounding interest
        compoundInt.compoundRate();
        */
        
        /*
        //selection sort
        int[] array1 = {40,60,59,46,98,82,23,51,31,36};
        System.out.println("Initital Array:");
        select.printArray(array1);
        System.out.println();
        select.selectSort(array1);
        */
        
        
        
        
        
        
    }
    
    
    //can call in same class as main
    //without an object... just with the
    //method name
    public static void output1()
    {
        System.out.println("The world is not flat!");
    }
}
