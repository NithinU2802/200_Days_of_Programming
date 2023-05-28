/******************************************************************************

Write a Java program to create an array of its anti-diagonals from a given square matrix. 

Example:
Input :
1 2
3 4

Output:
[
[1],
[2, 3],
[4]
]

*******************************************************************************/

import java.util.*;

class Main{
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt();
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
    a[i][j]=x.nextInt();
    int j=0,i=0,k=0;
    System.out.println("[");
    while(j<n){
        i=0;
        k=j;
        while(k>=0){
            System.out.print(a[i][k]+" ");
            k--;
            i++;
        }
        System.out.println();
        j++;
    }
    i=1;
    while(i<n){
        j=n-1;
        k=i;
        while(k<n){
            System.out.print(a[k][j]+" ");
            k++;
            j--;
        }
        System.out.println();
        i++;
    }
    System.out.println("]");
    }
}
