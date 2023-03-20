/******************************************************************************

First repeating elements of the given array...


Input: 10 5 3 4 3 5 6
Output: 5 


Input: 6 10 5 4 9 120 4 6 10
Output: 6 


*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++)
	    if(a[i]==a[j]){
	        System.out.print(a[i]+" ");
	        return;
	    }
	}
	System.out.print("-1");
	}
}
