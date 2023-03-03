/******************************************************************************

whether the sentence is pangram or not pangram.........

Input:
We promptly judged antique ivory buckles for the next prize

Output:
pangram


Input:
We promptly judged antique ivory buckles for the prize

Output:
not pangram

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int[] a=new int[127];
	String s=x.nextLine();
	for(int i=0;i<s.length();i++) a[Character.toLowerCase(s.charAt(i))]=1;
	for(int i=97;i<123;i++) if(a[i]==0){
	    System.out.print("not pangram");
	    return;
	}
	System.out.print("pangram");
	}
}
