/******************************************************************************

      Write a Java program to find the k largest elements in a given array. Elements
in the array can be in any order.


Input:
7
[1, 4, 17, 7, 25, 3, 100]
3

Output:
100 25 17


*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void KlargestElement(int[] ar,int k){
        int n=ar.length;
        int[] large=new int[k];
        for(int i=0;i<n;i++){
            if(ar[i]>large[0]){
                for(int j=k-1;j>0;j--) large[j]=large[j-1];
                large[0]=ar[i];
            }
        }
        print(large);
    }
    
    public static void print(int[] a){
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	int k=x.nextInt();
	KlargestElement(a,k);
	}
}
