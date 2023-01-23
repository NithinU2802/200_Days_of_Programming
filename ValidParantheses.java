/******************************************************************************

Check whether the given expressions has valid parantheses by program


Input: [()]{[()][]}

output: Balanced


Input: [(])

output: Not Balanced


*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	char[] a=new char[s.length()];
	int n=-1;
	for(int i=0;i<s.length();i++){
	    if(s.charAt(i)==' ') continue;
	    if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){ a[++n]=s.charAt(i); }
	    else{
	        char t=' ';
	        if(s.charAt(i)==')') t='(';
	        else if(s.charAt(i)==']') t='[';
	        else if(s.charAt(i)=='}') t='{';
	        
	        if(a[n]==t) n--;
	        else{
	            System.out.println("Not Balanced");
	            return;
	        }
	    }
	}
	System.out.print("Balanced");
	}
}
