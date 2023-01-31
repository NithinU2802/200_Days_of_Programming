/******************************************************************************

Print largest Odd Integer in the given array...

Input:  1 2 3 4 5 6 7 8 9
        
Output:  9


Input: 19 73 79 73 19 59 79
       
Output:  79


Input: 60 12 4 10

output: -1

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
	int m=-1;
	for(int i: a){
	    if(i%2!=0){
	     if(m<i) m=i;   
	    }
	}
	System.out.print(m);
	}
}
