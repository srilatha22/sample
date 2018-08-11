import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone35
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String text= "I love java Technologies. J@v@123" ; 

int wordCount = 0; 
int alphabetCount =0; 
String repeatedAlphabets = ""; 
int spaceCount = 0; 
int specialCharCount = 0; 
int numberCount = 0; 

for(int i=0;i<text.length();i++){ 
String textArray[] = text.split(" "); 
wordCount =textArray.length; 
char c1 = text.charAt(i); 

if(Character.isAlphabetic(c1)) { 
alphabetCount++; 

for(int j =i+1 ;j<text.length() ;j++){ 
char c2 = text.charAt(j); 

if(c1==c2 ) { 
String s =String.valueOf(c1); 
if(repeatedAlphabets.contains(s)){ 
continue; 
} 
repeatedAlphabets = repeatedAlphabets +" "+c1;; 
} 
} 
}else if(Character.isSpaceChar(c1)){ 
spaceCount++; 
}else if(Character.isDigit(c1)) { 
numberCount++; 
}else { 
specialCharCount++; 
} 


} 
System.out.println(wordCount); 
System.out.println(alphabetCount); 
System.out.println(repeatedAlphabets); 
System.out.println(spaceCount); 
System.out.println(specialCharCount); 
System.out.println(numberCount); // your code goes here
	}
}
