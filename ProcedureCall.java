/******************************************************************************

        Call by reference and call by value 

*******************************************************************************/
import java.util.*;

public class Main {
    
    public static void generate(List<Integer> al){
        al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
    }
    
    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
    }
    
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<>();
		
		// call by reference (Object)
		generate(arr);
		int a=3,b=9;
		
		// call by value (Variable and Value)
		swap(a,b);
		
		System.out.println("Modified ArrayList : " +arr);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}
