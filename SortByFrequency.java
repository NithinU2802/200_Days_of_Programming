/******************************************************************************

Print the frequency of the elements in the array..........


Input: 4
11 12 43 51

output: 11 12 51 43

Input: 4
21 12 43 34

output: 12 21 34 43


*******************************************************************************/
import java.util.*;

public class Main
{
    public static void sort(int[] a,int[] b){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int t=b[i];
                b[i]=b[i+1];
                b[i+1]=t;
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	for(int i=0;i<n;i++){
	    a[i]=x.nextInt();
	    int t=a[i];
	    while(t>0){
	        b[i]+=(t%10);
	        t/=10;
	    }
	}
	
	sort(b,a);
	for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
}

