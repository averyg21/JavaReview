/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeleveltest;

/**
 *
 * @author Avery
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;

public class GradeLevelTest 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter directory path:");
        
        Path path = Paths.get(input.nextLine());
       
        if (Files.exists(path))
        {
            System.out.printf("%s does exist%n%n", path);
            GradeLevel grade = new GradeLevel();
        
            grade.setWordCount(path);
            grade.setNumSent(path);
            grade.setSyllables(path);
            
            grade.getNumSent();
            grade.getSyllables();
            grade.getWordCount();
            
            int word = grade.NumWords;
            int sent = grade.NumSentences;
            int syllables = grade.Syllables / 3;
            int readLevel = (int) ((.39 *(word / sent)) + (11.8 * (syllables / word)) - 15.59);
            if (readLevel < 0)
            {
                readLevel = 0;
            }
            if (readLevel > 12)
            {
                readLevel = 12;
            }
            
            System.out.printf("%nNumber of words in doc is: %d%n" ,word);
            System.out.printf("Number of sentences in doc is: %d%n" ,sent);
            System.out.printf("Number of syllables in doc is: %d%n" ,syllables);
            System.out.printf("The reading grade level is: %d%n", readLevel);
        }
        else
        {
            System.out.printf("%n%s does not exist%n", path);
            System.out.print("Please re-run and enter correct path.\n");
        }
       
    }
    
    
    
}
