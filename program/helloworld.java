import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int result=a.compareTo(b);
		if(result==0)
		System.out.println("both are equal");
		else if(result>0)
		System.out.println(a);
		else
		System.out.println(b);
	}
}
