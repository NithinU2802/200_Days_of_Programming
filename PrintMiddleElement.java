/******************************************************************************

print Middle or both Middle element based on odd and even number of elements...

Input: 34 56 98
Output: 56


Input: 34 65 87 23 9 2
Output: 87 23


Input: 76 39 23 20 72
Output: 23


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
	if(n%2!=0) System.out.print(a[n/2]);
	else System.out.print(a[(n/2)-1]+" "+a[n/2]);
	}
}
