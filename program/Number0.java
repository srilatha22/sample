import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Number0
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
	
}
