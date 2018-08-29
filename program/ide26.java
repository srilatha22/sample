import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ide26.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        int i, j, a, n;
         int arr[]=new int[30];
    		Scanner sc=new Scanner(System.in);
        	n=sc.nextInt();
        for (i = 0; i < n; ++i)
            arr[i]=sc.nextInt();
        for (i = 0; i < n; ++i) 
        {
            for (j = i + 1; j < n; ++j)
            {
 
                if (arr[i] > arr[j]) 
                {
 
                    a =  arr[i];
                    arr[i] =arr[j];
                    arr[j] = a;
 
                }
 
            }
 
        }
          for (i = 0; i < n; ++i)
	  {
		  if(i<n-1)
			System.out.print(arr[i]+" ");
		else
			System.out.println(a[i]);
	
	}
}
}
