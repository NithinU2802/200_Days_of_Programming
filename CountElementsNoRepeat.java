/******************************************************************************

Find elements count in a string without repeation...
only positive Integers....

Input: 2 3 1 3 2 

output: 2

Input: 4 2 5 3 2 2

ouput: 2

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int k=0,c=0,n=s.length;
	for(String i: s) a[k++]=Integer.parseInt(i);
	for(int i=0;i<n;i++){
	     k=a[i];
	    if(a[i]!=-1){
	    c++;
	    for(int j=i+1;j<n;j++){
	        if(a[j]==k) a[j]=-1;
	    }
	    }
	}
	System.out.print(c);
	}
}
