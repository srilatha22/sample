import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone37
{
	public static void main (String[] args) throws java.lang.Exception
	{
float first = 1.20f, second = 2.45f;
 
        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
 
        // Value of first is assigned to temporary
        float temporary = first;
 
        // Value of second is assigned to first
        first = second;
 
        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;
 
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
	}
}
