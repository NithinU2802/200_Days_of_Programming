/******************************************************************************

        Write a Java program to determine whether numbers in an array can be 
rearranged so that each number appears exactly once in a consecutive list of 
numbers. Return true otherwise false. 

Example:
Original array: [1, 2, 5, 0, 4, 3, 6]
True

Original array: {1, 2 ,5, 0, 3, 6, 7} 
False 

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),m=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	Arrays.sort(a);
	m=a[1]-a[0];
	for(int i=1;i<n-1;i++)
	    if(m!=a[i+1]-a[i]){
	        System.out.print("False");
	        return;
	    }
	System.out.println("True");
	}
}
