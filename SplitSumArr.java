/******************************************************************************

Program to break the array and make addition with each-other....

Input: 2 6 3 0 6 3 1
       4

Output: 26337


Input: 2 1
       2

Output: 21

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
	int k=x.nextInt(),f=0,se=0;
	for(int i=0;i<=k;i++) f=(f*10)+a[i];
	for(int i=k+1;i<n;i++) se=(se*10)+a[i];
	System.out.print(f+se);
	}
}
