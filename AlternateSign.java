/******************************************************************************

        Write a Java program that checks whether an array of integers alternates 
between positive and negative values

Example:
Original array: [1, -2, 5, -4, 3, -6]
True 

Original array: {1, 2 ,5, 4, 3, 6}
False

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),m=0,f=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	if(a[0]<0) f=1;
	else f=0;
	for(int i=1;i<n;i++){
	if((f==1 && a[i]<0) || (f==0 && a[i]>=0)){
	    System.out.println("False");
	    return;
	}
	if(f==1) f=0;
	else f=1;
	}
	System.out.println("True");
	}
}
