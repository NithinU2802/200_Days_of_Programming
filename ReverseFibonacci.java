/******************************************************************************

Reverse order of fibonacci series....

Input : 5
Output : 3 2 1 1 0

Input : 8
Output : 13 8 5 3 2 1 1 0

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] r=new int[n];
	int c=2,a=0,b=1,i=0;
	r[i++]=0;
	r[i++]=1;
	while(i<n){
	    int t=b;
	    b+=a;
	    r[i++]=b;
	    a=t;
	}
	i--;
	while(i>=0) System.out.print(r[i--]+" ");
	}
}
