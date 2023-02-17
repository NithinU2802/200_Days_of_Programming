/******************************************************************************

Make number series using 3 and 4...

Number series as 4 34 43 44 334 343 433 344 443 444..................

Input: 5

Output: 4 34 43 44 334

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static boolean check(int n){
        while(n>0){
            if((n%10)!=4) return true;
            n/=10;
        }
        return false;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int s=3;
	while(true){
	    int k=1;
	    while(s>k){
	        //System.out.print(k+" ");
	        int l=k,h=s;
	        while(s>l){
	            h=s;
	            System.out.print((s+l)+" ");
	            n--;
	        if(n==-1) return;
	            h+=l;
	            l*=10;
	        }
	        k=(k*10)+1;
	    }
	    s=(s*10)+3;
	}
	}
}
