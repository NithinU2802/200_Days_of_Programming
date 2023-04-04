/******************************************************************************

minimum of odd and maximum of even print number within range...

Input:
5
2 1 3 8 2

Output:
1 2 3 4 5 6 7 8

Input:
6
1 4 7 2 3 6

Output:
1 2 3 4 5 6 7

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	int om=Integer.MAX_VALUE,em=0;
	for(int i=0;i<n;i++){
	    if(a[i]%2==0 && a[i]>em) em=a[i];
	    if(a[i]%2!=0 && a[i]<om) om=a[i];
	}
	if(em<om){
	    for(int i=em;i<=om;i++)
	    System.out.print(i+" ");
	}else{
	    for(int i=om;i<=em;i++)
	    System.out.print(i+" ");
	}
	}
}
