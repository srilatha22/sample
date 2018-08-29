import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ide25
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        int n, temp;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for (int i =0; i <n; i++) 
        {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int y=n/2;
         for (int i =0; i <n; i++) 
        {
        	if(i==y)
        	{
        		System.out.println(a[i]);
        	}
        }
        
	}
}
