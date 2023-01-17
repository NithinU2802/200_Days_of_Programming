/*******************************************************************************

 Find the sum of the numbers in the array excluding the odd numbers that occurs
 before an even number.
 
input: 4 2 3 6

output: 12


input: 3 6 4 8 5 5

output: 26



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
	int sm=a[0];
	for(int i=1;i<n;i++){
	    if(a[i-1]%2==0 && a[i]%2!=0) continue;
	    sm+=a[i];
	}
	System.out.print(sm);
	}
}
