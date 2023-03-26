/******************************************************************************

Lambda Expression to print element of array..

Input: 4
1 2 5 4

Output:
1 2 5 4

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	Arrays.stream(a).forEach(i->{ System.out.print(i+" "); });
	}
}
