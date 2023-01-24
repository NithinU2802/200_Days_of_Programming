/******************************************************************************

Merge Two sorted arrays 

Input: 5 4
       
     -1 1 10 12 20
     
     1 2 10 11
        

Output: -1 1 1 2 10 10 11 12 20



*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int m=x.nextInt(),n=x.nextInt();
	int[] a=new int[m];
	int[] b=new int[n];
	for(int i=0;i<m;i++) a[i]=x.nextInt();
	for(int i=0;i<n;i++) b[i]=x.nextInt();
	int[] r=new int[m+n];
	int i=0,j=0,s=0;
	while(s<m+n){
	    if(a[i]>b[j]){
	        r[s++]=b[j];
	        j++;
	        if(b.length==j) break;
	    }else{
	        r[s++]=a[i];
	        i++;
	        if(a.length==i) break;
	    }
	}
	while(i<a.length) r[s++]=a[i++];
	while(j<b.length) r[s++]=b[j++];
	
	for(int e: r) System.out.print(e+" ");
	
	}
}
