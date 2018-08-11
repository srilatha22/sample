import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone39
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double largest;
 
	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first Number");
		double a=Double.parseDouble(br.readLine());
		System.out.println("enter the second Number");
		double b=Double.parseDouble(br.readLine());
		System.out.println("enter the third Number");
		double c=Double.parseDouble(br.readLine());
 
		if(a>b){
			if(a>c)
				largest=a;
			else
				largest=c;
		}
		else{
			if(b>c)
				largest=b;
			else
				largest=c;
		}
		System.out.println("largest number is: "+largest);
	}
 
	catch(IOException e){
		System.out.println("error in input");
		}
 // your code goes here
	}
}
