/******************************************************************************


Sum of two prime number is n...

Input: 34

Output: 3 31


Input: 128

Output: 1 127

*******************************************************************************/
import java.util.*;

public class Main{ 
    
    public static boolean isprime(int a){
        for(int i=2;i<a;i++)
        if(a%i==0) return false;
        return true;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=n-1;i>0;i--){
	    if(!isprime(i)) continue;
	    for(int j=1;j<=n/2;j++){
	        if(i+j>n) break;
	        if(!isprime(j)) continue;
	        if(i+j==n){ 
	            System.out.print(j+" "+i);
	            return;
	        }
	    }
	}
	System.out.print("-1");
	}
}
