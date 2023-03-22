/******************************************************************************


Count the number of possible triangle....

Input: 
4
4 6 3 7

Output: 3


Input: 
7
10 21 22 100 101 200 300

Output: 6


*******************************************************************************/

import java.util.*;

class Main{
    
    public static int triangle(int[] a,int n){
        Arrays.sort(a);
        int c=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
            for(int k=j+1;k<n;k++)
            if((a[i]+a[j])>a[k]) c++;
        return c;
    }
    
	public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) a[i]=x.nextInt();
	System.out.println(triangle(a,n));
	}
	
}
