import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone28
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] numbers = { 0,1,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};  
    int i, count = 0;

    for (i = 0; i < numbers.length; i++) {

        System.out.print(numbers[i] + " ");
        count++;

        if (count == 9)
            for (i = 9; i < numbers.length; i++)
                System.out.println(numbers[i] + " ");	
	}
}
}
