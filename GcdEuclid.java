/******************************************************************************

     Write a Java program to prove that Euclid’s algorithm computes the greatest
common divisor of two integers that have positive values.

Input:
10 23 

Output: 
1 

Input:
252 105

Output:
21

*******************************************************************************/
import java.util.*;

public class Main
{
    public static int gcdEuclid(int a,int b){
        if(a%b==0) return b;
        return gcdEuclid(b,a%b);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	System.out.print(gcdEuclid(a,b));
	}
}
