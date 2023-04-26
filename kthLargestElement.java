/******************************************************************************

Given an array of integers. Write a program to find the K-th largest sum of 
contiguous subarray within the array of numbers that has both negative and 
positive numbers.


Input:
3
20 -5 -1 
3
Output: 
14


Input:
4 
10 -10 20 -40
6
Output: 
-10



*******************************************************************************/

import java.util.*;

public class Main
{
    public static int sumSeries(int n){
        if(n==0) return 0;
        return n+sumSeries(n-1);
    }
    
    public static void swap(int[] a,int i,int j){
        a[i]^=a[j];
        a[j]^=a[i];
        a[i]^=a[j];
    }
    
    static int pivot(int[] a,int s,int e){
        int p=a[e];
        int i=s-1;
        for(int j=s;j<e;j++){
            if(a[j]>p){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,e);
        return i+1;
    }
    
    
    public static void sort(int[] a,int s,int e){
        if(s<e){
            int p=pivot(a,s,e);
            sort(a,s,p-1);
            sort(a,p+1,e);
        }
    }
    
    
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	int k=x.nextInt();
	int m=sumSeries(n);
	int[] arr=new int[m];
	int l=0;
	for(int i=0;i<n;i++){
	    int s=0;
	    for(int j=i;j<n;j++){
	        s+=a[j];
	        arr[l++]=s;
	    }
	}
	for(int j=0;j<m;j++)
	System.out.print(arr[j]+" ");
	System.out.println();
 	sort(arr,0,m-1);
	for(int j=0;j<m;j++)
	System.out.print(arr[j]+" ");
	if(k>m)
	System.out.print("Invalid key..!");
	else 
	System.out.print("\n"+arr[k-1]);
	}
}
