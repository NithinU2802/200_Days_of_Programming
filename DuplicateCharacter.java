/******************************************************************************

Write a Java program to print the result of removing duplicates from a given string.

Input:
Nithin

Output:
Nithn

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	char[] a=new char[256];
	String res="";
	for(int i=0;i<s.length();i++){
	a[s.charAt(i)]++;
	if(a[s.charAt(i)]==1) res+=s.charAt(i);
	}
	System.out.println(res);
	}
}
