import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class progression
{
	public static void main (String[] args) throws java.lang.Exception
	{
	

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first term, common difference and n (number of terms)");
    int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
    System.out.print("Sum: "+n*(2*a+(n-1)*d)/2);
    }
}
