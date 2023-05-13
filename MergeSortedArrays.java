/******************************************************************************

        Given two sorted arrays A and B of size p and q, write a Java program 
to merge elements of A with B by maintaining the sorted order i.e. fill A with 
first p smallest elements and fill B with remaining elements.

Input :
n=6
int[] A = { 1, 5, 6, 7, 8, 10 }
m=3
int[] B = { 2, 4, 9 }

Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]

*******************************************************************************/

import java.util.*;

public class Main{
    
    static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;;
    }
    
    static int partition(int[] a,int s,int e){
        int p=a[e];
        int i=s-1;
        for(int j=s;j<=e-1;j++){
            if(a[j]<p){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,e);
        return i+1;
    }
    
    static void sort(int[] a,int s,int e){
        if(s<e){
            int p=partition(a,s,e);
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
	int m=x.nextInt();
	int[] b=new int[m];
	for(int i=0;i<m;i++)
	b[i]=x.nextInt();
	int[] res=new int[m+n];
	int r=m+n;
	for(int i=0;i<n;i++) res[i]=a[i];
	for(int i=0;i<m;i++) res[n+i]=b[i];
	sort(res,0,n+m-1);
	System.out.println();
	for(int i=0;i<n;i++) 
	System.out.print(res[i]+" ");
	System.out.println();
	for(int i=0;i<m;i++)
	System.out.print(res[n+i]+" ");
	}
}
