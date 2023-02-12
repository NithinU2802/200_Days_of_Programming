/******************************************************************************

sum value between 5 and 10

Input: 5 4 2 10 5 4
output: 10

Input: 2 3 5 2 5 5 10 5 4
Output: 16

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0,sum=0,f=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	for(int i=0;i<n;i++){
	    if(a[i]==5 && f==0){ f=1; continue; }
	    if(a[i]==10){ f=0; continue; }
	    if(f==1) sum+=a[i];
	}
	System.out.print(sum);
	}
}
