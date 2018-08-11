import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone36
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String str = "one$two$three$four!five@six$";
 
    int count = str.length() - str.replaceAll("\\$","").length();
 
    System.out.println("Done:"+ count);	// your code goes here
	}
}
