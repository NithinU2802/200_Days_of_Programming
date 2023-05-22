/******************************************************************************

Write a Java program to find the kth smallest and largest element in a given array.
Elements in the array can be in any order.


Input:
7 
[1, 4, 17, 7, 25, 3, 100]
2 
output:
smallest 3
largest 25

*******************************************************************************/
import java.util.*;

public class Main
{
    public static int smallest(int[] a,int k){
        int t;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
        return a[k-1];
    }
    public static int largest(int[] a,int k){
        int[] r=new int[k];
        r[0]=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>r[0]){
                for(int j=k-1;j>0;j--) 
                r[j]=r[j-1];
                r[0]=a[i];
            }
        }
        return r[k-1];
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	int k=x.nextInt();
	System.out.println("smallest "+smallest(a,k));
	System.out.println("largest "+largest(a,k));
	}
}
