import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone31
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
 
        System.out.println("Please enter a string");
 
        String input = sc.nextLine();
 
        System.out.println(input);
 
        String str = input;
        String[] myString = str.split(" ");
        int length = str.length();
        System.out.println(length);	// your code goes here
	}
} 
