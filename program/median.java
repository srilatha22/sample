
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class median
{
	public static void main (String[] args) throws java.lang.Exception
	{

      double numbers[] ={1.0, 2.0, 3.0};
      System.out.println(median(numbers));
   }
   public static double median(double[]x){
      double sum = 0;
      for(int i=0;i<x.length;i++){
         sum += x[i];
      }
      return sum/x.length;
   }
	
}
