/******************************************************************************

Rearrange the Positive and negative numbers no sorting move nearby elements.....

Input:
 -1 2 -3 4 5 6 -7 8 9

Output:
2 -1 4 -3 5 -7 6 8 9

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
	for(int i=0;i<n;i++){
	    if(i%2!=0){
	        if(a[i]<0) continue;
	        int j=i;
	        for(j=i+1;j<n;j++)
	        if(a[j]<0) break;
	        if(j<n){
	            int t=a[j];
	            while(j>i) a[j]=a[--j];
	            a[i]=t;
	        }
	    }else{
	        if(a[i]>0) continue;
	        int j=i;
	        for(j=i+1;j<n;j++)
	        if(a[j]>0) break;
	        if(j<n){
	            int t=a[j];
	            while(j>i) a[j]=a[--j];
	            a[i]=t;
	        }
	    }
	}
	for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
}
