/******************************************************************************

Write a Java program to create a method that takes a string as input and throws 
an exception if the string does not contain vowels.

Input:
Java handling and managing exceptions

Output:
String Contains Vowels.


Input:
Typy gyps fly.

Output:
Error: String does not contain any vowels

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	try {
	    String s=x.nextLine();
	    vowel(s);
	    System.out.print("String Contains Vowels.");
	} catch(Exception e) {
	    System.out.print("Error: "+e.getMessage());
	}
	}
	
	public static void vowel(String s) throws NoVowelsException{
	    char c;
	    int f=0;
	    for(int i=0;i<s.length();i++){
	        c=Character.toLowerCase(s.charAt(i));
	        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
	            f=1;
	            break;
	        }
	    }
	     if(f==0)
	        throw new NoVowelsException("String does not contain any vowels.");
	}
}
	class NoVowelsException extends Exception {
        public NoVowelsException(String message) {
        super(message);
    }
	}

