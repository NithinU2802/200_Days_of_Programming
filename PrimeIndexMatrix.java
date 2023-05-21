/******************************************************************************

      Write a Java program to create a two-dimensional array (m x m) A[][] such 
that A[i][j] is false if i and j are prime otherwise A[i][j] becomes true

Input:
3 3

Output: 
true true true
true true true
true true false

*******************************************************************************/
import java.util.*;

public class Main
{
    public static void notPrimeIndex(int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            System.out.print((!isprime(i) || !isprime(j))+" ");
            System.out.println();
        }
    }
    
    public static boolean isprime(int n){
        if(n<2) return false;
        else if(n==2) return true;
        for(int i=2;i<n/2;i++)
        if(n%i==0) return false;
        return true;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	notPrimeIndex(a,b);
	}
}
