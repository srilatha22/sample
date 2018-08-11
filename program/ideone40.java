import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone40
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n1=0,n2=1,n3,i,count=10;    
 System.out.print(n1+" "+n2);//printing 0 and 1    
 
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    // your code goes here
	}
}
