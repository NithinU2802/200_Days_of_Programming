/******************************************************************************

Using Recursion reverse the string such as...

Input: one two three
Output: three two one

Input: I love india
Output: india love I 

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void print(String[] a,int n){
        if(n==-1) return;
        System.out.print(a[n]+" ");
        print(a,n-1);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] a=x.nextLine().split(" ");
	print(a,a.length-1);
	}
}
