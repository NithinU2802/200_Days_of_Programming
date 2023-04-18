/******************************************************************************

Remove Character from substring in main String for the following

Input: 
Computer
cat 
Output: 
ompuer 


Input:
occurrence
car 
Output:
ouene 

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),a=x.nextLine();
	char[] ref=new char[127];
	for(int i=0;i<a.length();i++)
	ref[a.charAt(i)]=1;
	String r="";
	for(int i=0;i<s.length();i++)
	    if(ref[s.charAt(i)]==0)
	    r+=s.charAt(i);
	System.out.println(r);
	}
}
