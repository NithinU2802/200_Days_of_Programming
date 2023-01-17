/*******************************************************************************

Next Greater Element

input: 2 3 4 5

output: 

3 4 5 -1


input: 8 5 1 2

output: 

-1 -1 2 -1

*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s)
	a[n++]=Integer.parseInt(i);
	int m;
	for(int i=0;i<n;i++){
	    m=a[i];
	    if(i+1<n)
	    for(int j=i+1;j<n;j++)
	    if(m<a[j]){ m=a[j]; break; }
	    if(m==a[i]) System.out.print("-1 ");
	    else System.out.print(m+" ");
	}
	}
}
