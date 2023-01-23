/******************************************************************************

Remove palindrome words from sentence... 


Input: Text contains malayalam and level words

output: Text contains and words


Input: abc bcd

output: abc bcd


*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static boolean ispalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine().trim();
	int f=0;
	String r="",res="";
	for(int i=0;i<s.length();i++){
	    if(s.charAt(i)==' '){
	        while(s.charAt(i)==' ') i++;
	        if(!ispalin(r)) res+=(r+" ");
	        r="";
	    }
	    r+=s.charAt(i);
	}
	if(s.charAt(s.length()-1)!=' '){
	    if(!ispalin(r)) res+=r;
	}
	System.out.print(res);
	}
}
