/******************************************************************************

Sum with right adjacent element....

Input: 1 2 3 4 5 6

Output: 3 7 11


Input: 1 2 3

Output: 3 3

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
	for(int i=0;i+1<n;i+=2)
	System.out.print((a[i]+a[i+1])+" ");
	if(n%2!=0) System.out.print(a[n-1]);
	}
}
