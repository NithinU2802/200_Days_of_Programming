/******************************************************************************

 In main method read an integer (containing only numeric digits without decimal 
 and special characters) and check whether the given number is perfect square or
 not. If it is print TRUE (as string) else print FALSE(as string ).
 
 Input:
 4
 Output:
 Yes 
 
 Input:
 23
 Output:
 No 

*******************************************************************************/

import java.util.*;

public class Main
{
    public static double sqrt(double n){
        double t=0,s=n/2;
        while(t!=s){
            t=s;
            s=((n/t)+t)/2;
        }
        return s;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	double n=x.nextDouble();
	n=sqrt(n);
	if((int)n==n)
	System.out.println("Yes");
	else 
	System.out.println("No");
	}
}
