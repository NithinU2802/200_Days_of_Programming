/******************************************************************************

Write a Java program to find the maximum product of two integers in a given array of integers.

Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56

*******************************************************************************/

import java.util.*;

class Main{
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=x.nextInt();
    int s=-1,e=-1,max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++)
        if((a[i]*a[j])>max){ 
            max=a[i]*a[j];
            s=a[i];
            e=a[j];
        }
    }
    System.out.print("Pair: ("+s+","+e+")  ");
    System.out.println("Maximum Product: "+max);
    }
}
