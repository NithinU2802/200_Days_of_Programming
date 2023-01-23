/******************************************************************************

Maximum number of character in a string 


Input: sample texting

output: e


Input: grass is greener on the other side

output: e


*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int[] a=new int[128];
	int m=0;
	char r='-';
	for(int i=0;i<s.length();i++){
	    if(s.charAt(i)==' ') continue;
	    a[s.charAt(i)]++;
	    if(a[s.charAt(i)]>m){ m=a[s.charAt(i)]; r=s.charAt(i); }
	}
	System.out.print(r);
	}
}
