/******************************************************************************

Check two arrays are equal or not.... If equal print equal elements else print -1....

Input: 4 5 6 3
       5 6 4 3

output: 3 4 5 6

Input: 4 2 3 1 
       3 2 1 5
       
Output: -1

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
	int m=0;
	s=x.nextLine().split(" ");
	int[] b=new int[s.length];
	for(String i: s) b[m++]=Integer.parseInt(i);
	Arrays.sort(a);
	Arrays.sort(b);
	if(m!=n){
	    System.out.print("-1");
	    return;
	}
	for(int i=0;i<a.length;i++){
	    if(a[i]!=b[i]){
	        System.out.println("-1");
	        return;
	    } 
	}
	for(int i: a) System.out.print(i+" ");
	}
}
