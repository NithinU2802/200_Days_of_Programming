/******************************************************************************

Write a Java program to remove duplicate elements from a given array and return 
the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new 
length of the array. 

*******************************************************************************/

import java.util.*;

class Main{
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=x.nextInt();
    Arrays.sort(a);
    int res=1;
    for(int i=1;i<n;i++)
    if(a[i-1]!=a[i]) res++;
    System.out.print(res);
    }
}
