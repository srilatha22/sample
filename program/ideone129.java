import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone129
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
                          int n,hour,min;
                          Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<60)
		{
		System.out.println(0+" "+n);
		}
		else
		{
		hour=(int)n/60;
		min=(int)n%60;
		System.out.println(hour+" "+min);
		}
	}
}
