/******************************************************************************

        Write a Java program to calculate the largest gap between sorted elements 
of an array of integers.

Example:
Original array: [23, -2, 45, 38, 12, 4, 6]
Largest gap: 15

Original array: {1, 2 ,9, 0, 4, 6}
Largest gap: 3

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),t,m=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	Arrays.sort(a);
	for(int i=0;i<n-1;i++){
	    if((a[i]<0 && a[i+1]<0) || (a[i+1]>=0 && a[i]>0))
	    t=Math.abs(a[i+1])-Math.abs(a[i]);
	    else{
	        if(a[i]>0){ t=a[i]; t+=a[i+1];
	        }else{ t=a[i+1]; t+=a[i];
	        }
	    }
	    if(t>m) m=t;
	}
	System.out.println("Largest Gap: "+m);
	}
}
