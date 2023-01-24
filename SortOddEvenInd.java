/******************************************************************************

sort odd index position in ascending order and even in descending order.

Input: 1 2 3 4 5 6 7 8 9

Output: 1 8 3 6 5 4 7 2 9


*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void sort(int[] a,int n){
        for(int i=0;i<n-1;i++){
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
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	int[] ev=new int[(n/2)+1];
	int[] od=new int[(n/2)+1];
	int e=0,o=0;
	for(int i=0;i<s.length;i++){
	    if(i%2==0) od[o++]=a[i];
	    else ev[e++]=a[i];
	}
	int[] r=new int[s.length];
	sort(od,o);
	sort(ev,e);
	e--;
	o=0;
	int k=0,f=0;
	for(int i=0;i<s.length;i++){
	    if(f==0){
	        r[k++]=od[o++];
	        f=1;
	    }else{
	        r[k++]=ev[e--];
	        f=0;
	    }
	}
	for(int i=0;i<s.length;i++) System.out.print(r[i]+" ");
	}
}
