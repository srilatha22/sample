import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class sorting
{
	public static void main (String[] args) throws java.lang.Exception
	{
 
 
      String names[] = { "Peter", "Patricia", "Hunter", "Sarah",
        "Gabe", "Gina", "Rob", "John", "Zoey", "Tammy", "Robert",
        "Sean", "Paschal", "Kathy", "Neleh", "Vecepia" };
      System.out.println("The original order:");
     for (int i = 0; i < names.length; i++)
       System.out.println(i + ": " + names[i]);
     Arrays.sort(names);
     System.out.println("The new order:");
     for (int i = 0; i < names.length; i++)
       System.out.println(i + ": " + names[i]);	// your code goes here
	}
}
