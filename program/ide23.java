import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ide23
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
    	int a[]=new int[10];
    	int minimum,n, i, location = 1;
    	 Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
    	for (i= 0 ;i<n ; i++ )
        	a[i]=sc.nextInt();
 
      minimum = a[0];
       for (i=1 ;i<n;i++ ) 
    		{
        		if ( a[i] < minimum ) 
        			{
        			    minimum = a[i];
        		               location = i+1;
        			}
    		} 
 
    	System.out.println(minimum);
    
	}
}
