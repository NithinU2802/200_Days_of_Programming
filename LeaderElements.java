/******************************************************************************

consider an array of elements are there. Each element can be a leader when it 
satify one condition 

  * It should larger than forward elements
  
Input : 4 {10,9,8,11}
Output : 11

Input : 6 {6,5,3,4,1,2}
Output : 6 5 4 2

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
	Stack<Integer> stack=new Stack<Integer>();
	for(int i=0;i<n;i++)
	if(stack.isEmpty()) stack.add(a[i]);
	else{
	    while(!stack.isEmpty() && stack.peek()<a[i]) stack.pop();
	    stack.add(a[i]);
	}
	String res="";
	while(!stack.isEmpty()) res=String.valueOf(stack.pop())+" "+res;
	System.out.println(res);
	}
}
