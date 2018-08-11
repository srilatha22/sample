import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone34
{
	public static void main (String[] args) throws java.lang.Exception
	{
int words = 0;
    int lines = 0;
    int chars = 0;
    while(in.hasNextLine())  {
        lines++;
        String line = in.nextLine();
        chars += line.length();
        words += new StringTokenizer(line, " ,").countTokens();
    }	
   }
}
