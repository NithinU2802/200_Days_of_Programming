/*
Given an m x n matrix, return all elements of the matrix in spiral order.


 Input:matrix  m=3 and n=3
                [[1,2,3],
                [4,5,6],
                [7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100 */

"Program:

Hint: Top, corner ,bottom and first column corner "

import java.util.*;

class Main{
public static void main(String[] arg){
Scanner x=new Scanner(System.in);
System.out.print("Enter row: ");
int n=x.nextInt();
System.out.print("Enter Column: ");
int m=x.nextInt();
int[][] a=new int[n][m];
System.out.println("Enter Matrix: ");
for(int i=0;i<n;i++)
for(int j=0;j<m;j++) a[i][j]=x.nextInt();

//core Program 
int si=0,ei=n-1,sj=0,ej=m-1,ch=1,c=0;
System.out.println("Solution: ");
while(c<n*m){
switch(ch){
    
case 1:
for(int j=sj;j<=ej;j++){
System.out.print(a[si][j]+" ");
c++;
}
si++;
break;

case 2:
for(int i=si;i<=ei;i++){
System.out.print(a[i][ej]+" ");
c++;
}
ej--;
break;

case 3:
for(int j=ej;j>=sj;j--){
System.out.print(a[ei][j]+" ");
c++;
}
ei--;
break;

case 4:
for(int i=ei;i>=ej;i--){
System.out.print(a[i][sj]+" ");
c++;
}
sj++;
break;

}
ch++;
if(ch==5) ch=1;
}

}
}
