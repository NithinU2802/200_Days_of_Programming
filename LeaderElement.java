/******************************************************************************

    Leader element from the array..!
    
Input:
4
1 2 6 3

Output:
6

Input:
6
1 3 2 4 6 5

Output:
6

Input:
5
1 2 3 4 5

Output:
-1

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	int m=-1;
	for(int i=1;i<n-1;i++){
	    if(a[i-1]<a[i] && a[i]>a[i+1]){
	        if(m<a[i]) m=a[i];
	    }
	}
	System.out.println(m);
	}
}
