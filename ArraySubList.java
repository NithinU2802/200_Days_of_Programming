/******************************************************************************

Write a Java program to extract a portion of an array list.

Input:
5
[Red, Green, Orange, White, Black]     

Output:
[Red, Green, Orange]

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	List<String> a=new ArrayList<>();
	for(int i=0;i<n;i++) a.add(x.next());
	List<String> res=a.subList(0,3);
	System.out.println(res);
	}
}
