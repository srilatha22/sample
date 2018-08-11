import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone32
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 BufferedReader reader = null;
 
        //Initializing charCount, wordCount and lineCount to 0
 
        int charCount = 0;
 
        int wordCount = 0;
 
        int lineCount = 0;
 
        try
        {
            //Creating BufferedReader object
 
            reader = new BufferedReader(new FileReader("C:\\sample.txt"));
 
            //Reading the first line into currentLine
 
            String currentLine = reader.readLine();
 
            while (currentLine != null)
            {
                //Updating the lineCount
 
                lineCount++;
 
                //Getting number of words in currentLine
 
                String[] words = currentLine.split(" ");
 
                //Updating the wordCount
 
                wordCount = wordCount + words.length;
 
                //Iterating each word
 
                for (String word : words)
                {
                    //Updating the charCount
 
                    charCount = charCount + word.length();
                }
 
                //Reading next line into currentLine
 
                currentLine = reader.readLine();
            }
 
            //Printing charCount, wordCount and lineCount
 
            System.out.println("Number Of Chars In A File : "+charCount);
 
            System.out.println("Number Of Words In A File : "+wordCount);
 
            System.out.println("Number Of Lines In A File : "+lineCount);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
	}
}
