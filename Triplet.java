/******************************************************************************

    write a program to find the triplets in the given array that satisfies the
difference value you have to find the length of triplet.

Input:
7
1 2 4 5 7 8 10
3

Output:
{1,4,7},{2,5,8},{4,7,10}

*******************************************************************************/

import java.util.*;

class Main{
    
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=x.nextInt();
    int m=x.nextInt(),f=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(Math.abs(a[i]-a[j])==m && Math.abs(a[j]-a[k])==m){
                    if(f==0) f=1;
                    else System.out.print(",");
                    System.out.print("{"+a[i]);
                    System.out.print(","+a[j]);
                    System.out.print(","+a[k]+"}");
                }
            }
        }
    }
    if(f==0) System.out.print("-1");
    }
    
}
