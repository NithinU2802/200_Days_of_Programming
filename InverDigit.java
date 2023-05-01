/******************************************************************************

Invert every two integer from last....

Input:
7639

Output:
6793


Input:
73639

Output:
76393

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int r=0,f,l;
	while(n>0){
	    f=n%10;
	    n/=10;
	    if(n==0){
	        r=(r*10)+f;
	        break;
	    }
	    l=n%10;
	    r=(r*10)+l;
	    r=(r*10)+f;
	    n/=10;
	}
	while(r>0){
	    n=(n*10)+(r%10);
	    r/=10;
	}
	System.out.println(n);
	}
}
