/******************************************************************************

Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements 
in “arr[]” according to given index array. It is not allowed to given array 
arr’s length.

Example: 

Input: 3
10 11 12
1 0 2 
Output: 
11 10 12
0 1 2 

Input:  5 
50 40 70 60 90
3 0 4 1 2 
Output: 
40 60 90 50 70

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	int[] res=new int[n];
	for(int i=0;i<n;i++) 
	a[i]=x.nextInt();
	for(int j=0;j<n;j++)
	b[j]=x.nextInt();
	for(int i=0;i<n;i++)
	res[b[i]]=a[i];
	for(int i=0;i<n;i++)
	System.out.print(res[i]+" ");
	System.out.println();
	for(int i=0;i<n;i++)
	System.out.print(i+" ");
	}
}
