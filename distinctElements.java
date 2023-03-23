/******************************************************************************


print all distinct elements of the given array...

Input: 12 10 9 45 2 10 10 45
Output: 12 10 9 45 2

Input: 1 2 3 4 5
Output: 1 2 3 4 5

Input: 1 1 1 1 1
Output: 1

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static void distinctElement(int[] a){
        int n=a.length,c=0,f=0,fg=0;
        for(int i=0;i<n;i++){
            f=0;
            for(int j=i+1;j<n;j++)
            if(a[i]==a[j]) f=1;
            if(f==0){ 
                System.out.print(a[i]+" ");
                fg=1;
            }
        }
        if(fg==0) System.out.print("Please Enter Elements...?");
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i:s) a[n++]=Integer.parseInt(i);
	distinctElement(a);
	}
}
