/******************************************************************************

sort and return the index of key value...

Example:  

Input  : 5 6 7 8 9 10 1 2 3 
key = 3
Output : 2

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int rotate(int[] a,int in){
       int n=a.length;
       int t=a[n-1];
       for(int i=n-1;i>0;i--)
       a[i]=a[i-1];
       a[0]=t;
       in++;
       if(in==a.length)
       in=0;
       return in;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	int k=x.nextInt();
	int in=0,min=a[0];
	for(int i=0;i<n;i++)
	if(min>a[i]){ 
	    min=a[i];
	    in=i;
	}
	while(in!=0){
	    in=rotate(a,in);
	}
	for(int i=0;i<a.length;i++)
	if(a[i]==k){
	    System.out.println(i);
	    return;
	}
	System.out.println("-1");
	}
}
