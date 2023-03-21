/******************************************************************************

Identify the string is palindrome or not Ignore spaces...

Input:
RACE CAR 

Output:
True 

Input:
I DID, DID I 

Output:
True 

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int i=0,j=s.length()-1;
	while(i<s.length()){
	    if(s.charAt(i)==' ') i++;
	    else if(s.charAt(j)==' ') j--;
	    else{
	        if(s.charAt(i)!=s.charAt(j)){
	            System.out.print("False");
	            return;
	        }
	        i++;
	        j--;
	    }
	}
	System.out.println("True");
	}
}
