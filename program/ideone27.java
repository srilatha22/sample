import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone27
{

		boolean numberOrNot(String input)
{
    try
    {
        Integer.parseInt(input);
    }
    catch(NumberFormatException ex)
    {
        return false;
    }
    return true;
}
	}
