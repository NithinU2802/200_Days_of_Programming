/******************************************************************************

max price difference by the following conditions of prices.....

You are given an array prices where prices[i] is the price of a given stock on 
the ith day.

You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot 
achieve any profit, return 0.


Input: 7 1 5 3 6 4
Output: 5

Input: 7 6 4 3 1
Output: 0

*******************************************************************************/

import java.util.*;

public class Main{ 
    
	public static void main(String[] args){ 
	Scanner x=new Scanner(System.in);
	String[] b=x.nextLine().split(" ");
	int[] a=new int[b.length];
	int n=0;
	for(String i: b) a[n++]=Integer.parseInt(i);
	if(a.length==0) System.out.print("0");
	else{
	    int s=a[0],j=1,m=0;
	    while(j<a.length){
	        if(a[j]>s) m=m>a[j]-s?m:a[j]-s;
	        else s=a[j];
	        j++;
	    }
	    System.out.print(m);
	}
	}
}
