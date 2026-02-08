/*******************************************************************************

 You are given a array of Numbers where the largest number is unique. Determine
 whether the largest element in the array is at least twice as much as the 
 other number in the array....
 
input: 1 3 6 2

output: 2


input: 1 2 3 4

output: -1



*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int m=Integer.MIN_VALUE,ind=-1,n=0;
	for(String i: s){ 
	    a[n++]=Integer.parseInt(i.trim()); 
	    if(a[n-1]>m){ m=a[n-1]; ind=n-1; }
	}
	int f=0;
	for(int i=0;i<n;i++)
	    if(m<(a[i]*2) && i!=ind) f=1;
	if(f==1) System.out.print("-1");
	else System.out.print(ind);
	}
}
