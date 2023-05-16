/******************************************************************************

        Write a Java program to insert a dash (-) between an upper case letter 
and a lower case letter in a string.

Input:
Python Exercises

Output:
P-ython E-xercises


Input:
The quick brown Fox jumps over the lazy Dog.

Output:
T-he quick brown F-ox jumps over the lazy D-og.


Input:
java exercises

Output:
java exercises

*******************************************************************************/

import java.util.*;


public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	String r="";
	r+=s.charAt(0);
	for(int i=1;i<s.length();i++){
	    if(Character.isUpperCase(s.charAt(i-1)) && Character.isLowerCase(s.charAt(i))) r+='-';
	    r+=s.charAt(i);
	}
	System.out.println(r);
	}
}
