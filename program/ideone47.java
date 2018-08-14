import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone47
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i,max,min;
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];min=a[0];
		if(n==1)
		System.out.println(a[0]+" "+a[0]);
		else
		{
			for(i=0;i<n;i++)
			{
				if(min>a[i])
				min=a[i];
				if(max<a[i])
				max=a[i];
			}
			System.out.println(min+" "+max);
	}
	}
}
