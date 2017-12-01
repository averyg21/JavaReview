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
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Path;



public class GradeLevel
{
    BufferedReader inputStream = null;
    PrintWriter outputStream = null;
    int NumLines;
    int WordsInLine;
    int NumWords;
    int SentenceInLine;
    int NumSentences;
    int Syllables;
    
    public int setWordCount(Path filename) throws IOException
    {
        String path = filename.toString();
        try
        {
            inputStream = new BufferedReader(new FileReader(path));            
            
            String newLine;
            while ((newLine = inputStream.readLine()) != null)
            {
                String[] tokens = newLine.split(" ");
                WordsInLine = tokens.length;
                NumWords = NumWords + WordsInLine;
                
            }
        }
        finally
        {
            if (inputStream != null)
            {
                inputStream.close();
            }
            if (outputStream != null) 
            {
                outputStream.close();
            }
        }
        return NumWords;
    }
    
    public int getWordCount()
    {
        return NumWords;
    }
    
    public int setNumSent(Path filename) throws IOException
    {
        String path = filename.toString();
        try
        {
            inputStream = new BufferedReader(new FileReader(path));            
            
            String newLine;
            
            while ((newLine = inputStream.readLine()) != null)
            {               
                
                NumLines++;
                
                String[] tokens1;
                tokens1 = newLine.split("[.\\?\\!]");                
                SentenceInLine = tokens1.length - 1;
                NumSentences = NumSentences + SentenceInLine;   
                
            }
        }
        finally
        {
            if (inputStream != null)
            {
                inputStream.close();
            }
            if (outputStream != null) 
            {
                outputStream.close();
            }
        }
        
        return NumSentences;
    }
    
    public int getNumSent()
    {
        return NumSentences;
    }
    
    public int setSyllables(Path filename) throws IOException
    {
        String path = filename.toString();
        try
        {
            inputStream = new BufferedReader(new FileReader(path));            
            
            String newLine;
            while ((newLine = inputStream.readLine()) != null)
            {
                Syllables += (newLine.length());
             
            }
        }
        finally
        {
            if (inputStream != null)
            {
                inputStream.close();
            }
            if (outputStream != null) 
            {
                outputStream.close();
            }
        }
        
        return Syllables;
        
    }
    
    public int getSyllables()
    {
        return Syllables;
    }
            
}
