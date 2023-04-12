/******************************************************************************

Write a Java program to remove the duplicate elements of a given array and 
return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new 
length of the array.

*******************************************************************************/

import java.util.*;

public class Main
{
    public static int removeDuplicate(int[] a){
        int[] b=new int[a.length];
        int c=0;
        for(int i=0;i<a.length;i++){
            int f=0,fg=0;
            for(int j=i;j<a.length;j++){
                if(b[j]==0){
                    if(a[i]==a[j]){ 
                        b[j]=1;
                        fg=1; 
                    }
                    f=1;
                }
            }
            if(fg==1)
            c++;
            if(f==0) break;
        }
        return c;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	System.out.print(removeDuplicate(a));
	}
}
