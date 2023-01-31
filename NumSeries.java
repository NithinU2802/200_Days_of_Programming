/******************************************************************************

Number Series....

Input: 8

Output: 1 -2 -3 4 5 6 -7 -8


Input: 20

Output: 1 -2 -3 4 5 6 -7 -8 -9 -10 11 12 13 14 15 -16 -17 -18 -19 -20

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int f=0,i=1,l=0,k=1;
	while(i<=n){
	    if(f==0) System.out.print(i+" ");
	    else System.out.print((i*-1)+" ");
	    l++;
	    if(l==k){
	        l=0;
	        k++;
	        if(f==0) f=1;
	        else f=0;
	    }
	    i++;
	}
	
	}
}
