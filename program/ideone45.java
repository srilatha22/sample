import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone45
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
}
