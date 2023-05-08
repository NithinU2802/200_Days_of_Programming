/******************************************************************************

Sort String of the given array by length...!

Input:
5 
sunday
monday
tuesday
wednesday
thursday

Output:
sunday
monday
tuesday
thursday
wednesday

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	String[] ar=new String[n];
	x.nextLine();
	for(int i=0;i<n;i++)
	ar[i]=x.next();
	Arrays.sort(ar, (a, b) -> a.length() - b.length());
	for(String i:ar)
	System.out.println(i);
	}
}
