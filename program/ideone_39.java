import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ideone_39
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,max,i;
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[1];
		for(i=1;i<=n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
			}
		
		
