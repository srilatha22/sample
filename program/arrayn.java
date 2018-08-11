import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arrayn
{
	public static void main (String[] args) throws java.lang.Exception
	{

        int a[] = {1,2,3,4,5};
        int count = 0, i = 0, n;
        try
        {
            while(a[i] != 'a')
            {
                count++;
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Number of elements in array:"+count);
        }
        n = a.length;
        System.out.println("Number of elements(Using inbuilt method named length):"+n);
    }
}
