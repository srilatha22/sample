import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		
		{
			num=num/10;
			++count;
		}
			
			System.out.println(count);
		
	}
}
