import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ide0027
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
			char c;
		int i;
		int flag=0;
		for(i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			if(Character.isLetter(c))
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("no");
		else
		System.out.println("Yes");

	}
}
