/******************************************************************************

Count the word length greater then 1.............

Input: I want a pen 
Output: 2

Input: There is a group of members
Output: 5

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int ct=0,c=0;
	for(int i=0;i<s.length();i++){
	    if(s.charAt(i)==' '){
	        if(ct>1) c++;
	        ct=0;
	    }else ct++;
	}
	if(ct>1) c++;
	System.out.print(c);
	}
}
