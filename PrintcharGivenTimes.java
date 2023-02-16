/******************************************************************************

Write a program to give the following output for the given input

Input: a1b10
Output: abbbbbbbbbb

Input: b3c6d15
Output: bbbccccccddddddddddddddd

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int i=0;
	while(i<s.length()){
	    String r="",d="";
	    while(i<s.length() && Character.isAlphabetic(s.charAt(i))) r+=s.charAt(i++);
	    while(i<s.length() && Character.isDigit(s.charAt(i))) d+=s.charAt(i++);
	    for(int j=0;j<Integer.parseInt(d);j++) System.out.print(r);
	}
	}
}
