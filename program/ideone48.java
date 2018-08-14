import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone48
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a[]=new int[20];
		int i,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	            	if(n%2==0)
		{
			int k=(a[n/2]+a[n=1/2])/2;
			System.out.println(k);
		}
	              	else
		{
			int k=a[n/2];
			System.out.println(k);
			
		}
		
		
		
	}
}
