import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone62
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='0'||ch=='1')
			{
				count++;
				//break;
			}
		}
		if(count==str.length())
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
