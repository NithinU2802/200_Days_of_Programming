/******************************************************************************

Check whether the brackets are valid or not..........

Input:
{()()[]}

Output:
Yes 

Input:
{(})

Output:
No 

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int r=-1;
	char[] st=new char[s.length()];
	for(int i=0;i<s.length();i++){
	    char a=s.charAt(i);
	   if(r==-1){
	       if(a=='}' || a==']' || a=='}'){
	           System.out.print("No");
	           return;
	       }else st[++r]=a;
	   }else if(a=='}' && st[r]=='{') r--;
	   else if(a==']' && st[r]=='[') r--;
	   else if(a==')' && st[r]=='(') r--;
	   else if(a=='{' || a=='[' || a=='{') st[++r]=a;
	   else{
	       System.out.print("No");
	       return;
	   }
	   }
	   System.out.print("Yes");
	
	}
}

