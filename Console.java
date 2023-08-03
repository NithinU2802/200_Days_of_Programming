/******************************************************************************

    Usage of Console class implementation.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	String str;
	Console con;
	con=System.console();
	if(con==null)
	    return;
	    str=con.readLine("Enter Your Name: ");
	    con.printf("I am %s",str);
	}
}
