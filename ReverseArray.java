/******************************************************************************

Reverse elements of the array without using another array...

Input: 1 2 0 4 -5

Output: -5 4 0 2 1


Input: 7 5 3 1 9 2

Output: 2 9 1 3 5 7

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void swap(int[] a,int s,int e){
        int t=a[s];
        a[s]=a[e];
        a[e]=t;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	int i=0,j=n-1;
	while(i<j) swap(a,i++,j--);
	for(int e:a) System.out.print(e+" ");
	}
}
