/******************************************************************************

Find the missing Number in the given array....

Input: 1 2 3 5
       5 
Output: 4

Input: 6 1 2 8 3 4 7 10 5
      10
Output: 9


*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0,k=x.nextInt(),j=1;
	for(String i: s) a[n++]=Integer.parseInt(i);
	sort(a);
	while(j<=k){
	    if(j!=a[j-1]){
	        System.out.print(j);
	        return;
	    }
	    j++;
	}
	System.out.print("-1");
	}
}

