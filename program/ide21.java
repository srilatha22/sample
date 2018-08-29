import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ide21
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int d=s.nextInt();
		int sum=0;
		for(int i=a;n!=0;i=i+d)
		{
			sum=sum+i;
			
			n=n-1;
		}
		System.out.println(sum);
	}
}
