/******************************************************************************

          A string is created by using another string's letters. Letters are case
sensitive. Write a Java program that checks the letters of the second string are
present in the first string. Return true otherwise false.

Input: 
Java 
Ja

Output:
true

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),a=x.nextLine();
	int f=0;
	for(int i=0;i<a.length();i++){
	    f=0;
	    for(int j=0;j<s.length();j++){
	        if(a.charAt(i)==s.charAt(j)){
	            f=1;
	            break;
	        }
	    }
	    if(f==0){
	        System.out.println("false");
	        return;
	    }
	}
	System.out.print("true");
	}
}
