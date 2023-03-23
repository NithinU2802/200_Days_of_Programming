/*******************************************************************************

 You are given a array of Numbers where the largest number is unique. Determine
 whether the largest element in the array is at least twice as much as the 
 other number in the array....
 
input: 1 3 6 2

output: 2


input: 1 2 3 4

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
	for(String i: s)
	a[n++]=Integer.parseInt(i);
	int f=0,se=0,ind=0;
	for(int i=0;i<n;i++){
	    if(a[i]>f){
	        se=f;
	        f=a[i];
	        ind=i;
	    }else if(a[i]>se) se=a[i];
	}
	if(se*2>f) System.out.print("-1");
	else System.out.println(ind);
	}
}
