/******************************************************************************

You are provided with 3 numbers inputt, input2 and input3. Each of these are four 
digit numbers within the range 
>= 1000 and <-9999
1000<inputt < 9999
1000<input2- 9999
1000<input3 - 9999

You are expected to find the Key using the below formula
Key (Thousands digit of inputt x Hundreds digit of input2)+(Smallest digit of input3)
For e g it inputt-3521 input2-2452 input3-1352, then Key (3 x 4)+1=13
Assuming that the 3 numbers are passed to the given function Complete the function 
to find and return the Key

Input:
3521 
2452 
1352 

Output:
13

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int input1=x.nextInt(),input2=x.nextInt(),input3=x.nextInt();
	int s=input3%10;
	input1/=1000;
	input2/=100;
	int res=(input1*(input2%10));
	while(input3>0){
	    if(input3%10<s) s=input3%10;
	    input3/=10;
	}
	System.out.println((res)+s);
	}
}
