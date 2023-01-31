/******************************************************************************

Sum odd elements of fibonacci series upto nth elements....

Input: 8

Output: 10


Input: 99

Output: 188

*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int a=1,b=1;
	if(n==1) System.out.print(a);
	else if(n==2) System.out.print(a+b);
	else{
	    int s=2;
	    while(b<n){
	        int t=b;
	        b+=a;
	        if(b%2!=0)
	        s+=b;
	        a=t;
	    }
	    System.out.print(s);
	}
	}
}
