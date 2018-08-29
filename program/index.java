import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Index
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n,i;
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		System.out.println(a[i]+" "+i);
	}
	}
}
