import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone57
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,m,i,count=0;
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(m==arr[i])
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
