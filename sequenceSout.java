/******************************************************************************

   Write a Java program to return a string with characters at index positions 
0,1,2,5,6,7, ... from a given string.

Input:
aksjdinejdienj

Output:
aksineien 

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),r="";
	int c=0;
	for(int i=0;i<s.length();i++){
	    if(c==3){ i++; c=0; }
	    else{
	        r+=s.charAt(i);
	        c++;
	    }
	}
	System.out.println(r);
	}
}
