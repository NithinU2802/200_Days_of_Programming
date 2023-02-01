/******************************************************************************

Find GCD for the given strings....

Input: ABCABC  ABC

Output: ABC


Input: ABABAB  ABAB

Output: AB 

Input: NEET  EXAM

Output: -1 


*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static int gcd(int a,int b){
        int t=a;
        if(a>b) t=b;
        else t=a;
        while(t>0){
            if(a%t==0 && b%t==0) break;
            t--;
        }
        return t;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String a=x.next(),b=x.next();
	if(!(a+b).equals(b+a)){
	    System.out.print("-1");
	}else System.out.print(b.substring(0,gcd(a.length(),b.length())));
	}
}

