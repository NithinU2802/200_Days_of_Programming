/******************************************************************************

    GCD (i.e. Greatest Common Divisor) or HCF (i.e. Highest Common Factor) is the
largest number that can divide both the given numbers. Also with LCM of the given 
numbers.


Input:
10 20

Output:
LCM 20
GCD 10

Input:
9 21

Output:
LCM 27
GCD 3

Shortcut 
a*b=lcm(a,b)*gcd(a,b)
lcm(a,b)=(a*b)/gcd(a,b) 

*******************************************************************************/
import java.util.*;

public class Main
{
    
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	if(a>b){
	    a^=b;
	    b^=a;
	    a^=b;
	}
	System.out.println("LCM "+lcm(a,b));
	System.out.println("GCD "+gcd(a,b));
	}
}
