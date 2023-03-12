/******************************************************************************

Finding superior elements of the given array...

element which is greater then right side elements.....

Input:
5
2 5 3 4 8

Output:
1

Input:
5
5 2 5 4 3

Output:
3

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int findnumberofsuperiorelements(int[] a,int n){
    int c=0;
    for(int i=0;i<n;i++){
        int f=0;
        for(int j=i+1;j<n;j++){
            if(a[j]>=a[i]){ f=1; break; }
        }
        if(f==0) c++;
    }
    return c;
    }
    
    public static void main(String[] ar){
    Scanner x=new Scanner(System.in);
    int n=Integer.parseInt(x.nextLine());
    int[] a=new int[n];
    for(int i=0;i<n;i++) a[i]=x.nextInt();
    System.out.print(findnumberofsuperiorelements(a,n));
    }
}
