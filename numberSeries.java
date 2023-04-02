/******************************************************************************

Number series.....

I/p: 8
O/p: 1 -2 -3 4 5 6 -7 -8

I/p: 20
O/p: 1 -2 -3 4 5 6 -7 -8 -9 -10 11 12 13 14 15 -16 -17 -18 -19 -20

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int c=1,j=0,f=0;
	for(int i=1;i<=n;i++){
	    if(j==c){
	        if(f==1) f=0;
	        else f=1;
	        j=0;
	        c++;
	    }
	    if(j<c){
	       if(f==0) System.out.print(i+" ");
	       else System.out.print((i*-1)+" ");
	   }
	   j++;
	}
	}
}
