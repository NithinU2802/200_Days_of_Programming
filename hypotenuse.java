/******************************************************************************

Right Triangle values to implement hypotenuse...!

Input: 3.0 4.0
Output: 5.0

Input: 6 7
Output: 9.22


*******************************************************************************/

import java.util.*;

public class Main
{
    public static double hypotenuse(int a,int b){
        double d=Math.sqrt(a*a+b*b);
        return d;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	System.out.println(hypotenuse(a,b));
	
	}
}
