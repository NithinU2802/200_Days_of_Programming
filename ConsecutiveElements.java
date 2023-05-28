/******************************************************************************

Write a Java program to find the length of the longest consecutive elements 
sequence from an unsorted array of integers.

Sample array: [49, 1, 3, 200, 2, 4, 70, 5]

The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program 
will return its length 5. 

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
    int c=1,res=1;
    for(int i=1;i<n;i++){
        if(a[i-1]+1==a[i]) c++;
        else{
            if(res<c) res=c;
            c=1;
        }
    }
    System.out.println(res);
    }
}
