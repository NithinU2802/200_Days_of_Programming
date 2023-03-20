/******************************************************************************

print unique elements of three array and display elements (three sorted arrays).


Input: 
1 5 10 20 40 80
6 7 20 80 100
3 4 15 20 30 70 80 120

Output: 20 80

Input: 
1 5 5
3 4 5 5 10 
5 5 10 20

Output: 5 5

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
	s=x.nextLine().split(" ");
	int[] b=new int[s.length];
	n=0;
	for(String i: s) b[n++]=Integer.parseInt(i);
	s=x.nextLine().split(" ");
	n=0;
	int[] c=new int[s.length];
	for(String i:s) c[n++]=Integer.parseInt(i);
	
	int i=0,j=0,k=0;
	
	while(i<a.length && j<b.length && k<c.length){
	    if(a[i]==b[j] && b[j]==c[k]){
	        System.out.print(a[i]+" ");
	        i++;
	        j++;
	        k++;
	    }else if(a[i]<b[j]) i++;
	    else if(b[j]<c[k]) j++;
	    else k++;
	}
	
	}
}
