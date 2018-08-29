import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone130
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,h2,m1,m2,hour,min;
		Scanner sc=new Scanner(System.in);
		h1=sc.nextInt();
		m1=sc.nextInt();
		h2=sc.nextInt();
		m2=sc.nextInt();
			hour=Math.abs(h1-h2);
			min=Math.abs(m1-m2);
			System.out.println(hour+" "+min);
	}
}
