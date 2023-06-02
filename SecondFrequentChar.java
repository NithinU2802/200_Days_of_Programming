/******************************************************************************

 Write a Java program to get the contents of a given string as a byte array.
Write a Java program to find the second most frequent character in a given string.

Input:
successes

Output: 
c

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	char res=s.charAt(0),a='o';
	int sm=0;
	int[] alpha=new int[128];
	for(int i=1;i<s.length();i++){ 
	    alpha[s.charAt(i)]++;
	    if(sm<alpha[s.charAt(i)]){
	        a=res;
	        res=s.charAt(i);
	        sm=alpha[s.charAt(i)];
	    }
	}
	System.out.print(a);
	}
}
