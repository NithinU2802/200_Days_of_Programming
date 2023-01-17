/*******************************************************************************


Inner reducing pattern

input: 4


output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
    int n=x.nextInt(),t=n,k=0;
    System.out.println();
    for(int i=0;i<n;i++){
        t=n;
        for(int j=0;j<i;j++) System.out.print((t--)+" ");
        
        for(int j=0;j<n+n-1-(i+i);j++)  System.out.print((n-k)+" ");
        t++;
        for(int j=0;j<i;j++) System.out.print((t++)+" ");
        
        System.out.println();
        k++;
        
    }
    k--;
    for(int i=n-2;i>=0;i--){
        t=n;
        for(int j=0;j<i;j++) System.out.print((t--)+" ");
        
        for(int j=0;j<n+n-1-(i+i);j++)  System.out.print((n-k+1)+" ");
        t++;
        for(int j=0;j<i;j++) System.out.print((t--)+" ");
        
        System.out.println();
           k--;
    }
	}
}
