/******************************************************************************

Sum between two indexes print indexes.....

Input: 1 4 20 3 10 5
       33
Output: 2 4 

Input: 1 4 0 0 3 10 5 
       7
Output: 1 4

*******************************************************************************/ 
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int n=0,k=x.nextInt();
	int[] a=new int[s.length];
	for(String i: s) a[n++]=Integer.parseInt(i);
	for(int i=0;i<n;i++){
	    int sm=0;
	    for(int j=i;j<n;j++){
	        sm+=a[j];
	        if(sm==k){
	            System.out.print(i+" "+j);
	            return;
	        }
	    }
	}
	}
}

