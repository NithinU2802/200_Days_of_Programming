/******************************************************************************

Gap Sum of the given array...

Input:  1 2 3 4 5 6 7 8 9
        3
        
Output:  12 15 18 


Input: 1 2 3 4 5 6 7 8 9 10
       2
       
Output:  25 30 

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
	int k=x.nextInt();
	for(int i=0;i<k;i++){
	    int sm=0;
	    for(int j=i;j<n;j+=k) sm+=a[j];
	    System.out.print(sm+" ");
	}
	
	}
}
