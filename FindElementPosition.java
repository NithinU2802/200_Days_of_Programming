/******************************************************************************

Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were 
inserted in order.

Input: nums = [1,3,5,6], target = 5

Output: 2

Input: nums = [1,3,5,6], target = 2

Output: 1

Input: nums = [1,3,5,6], target = 7

Output: 4

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
	int k=x.nextInt(),i=0;
	for(i=0;i<a.length;i++)
	if(a[i]>=k) break;
	System.out.print(i);
	}
}
