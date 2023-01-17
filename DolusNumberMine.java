/*******************************************************************************

Dolus Number 
 A number which is an prime factors are 2,3 and 5 only.

input: 6

output: true

Explaination: 2 x 3 = 6

input: 8

output: true

Explaination: 2 x 2 x 2 = 8

input: 21

output: false

Explaination: 2 x 7

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int dolus(int n){
        if(n==1) return 0;
        if(n%5==0) return dolus(n/5);
        if(n%3==0) return dolus(n/3);
        if(n%2==0) return dolus(n/2);
        return n;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	if(dolus(n)==0) System.out.print("True");
	else System.out.print("False");
	}
}
