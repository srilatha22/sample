import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Naturalnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
