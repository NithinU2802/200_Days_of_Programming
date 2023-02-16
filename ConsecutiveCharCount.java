/******************************************************************************

 Write a program to give the following output for the given input....
 
Input: abbbbbbbbbb
Output: a1b10

Input: bbbccccccddddddddddddddd
Output: b3c6d15

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	char d=s.charAt(0);
	int c=0;
	String r="";
	for(int i=0;i<s.length();i++){
	    if(d==s.charAt(i)) c++;
	    else{
	        r+=(d+(String.valueOf(c)));
	        d=s.charAt(i);
	        c=1;
	    }
	}
	 r+=(d+(String.valueOf(c)));
	System.out.print(r);
	}
}
