/******************************************************************************

   Display Number of String for the given input.
   
Input:
String: Nithin
Enter Count: 2

Output:
Nithin
Nithin

*******************************************************************************/
import java.util.*;

public class Main
{
    interface Name{
        void print(String s,int n);
    }
    
    void print(String s,int n,Name obj){
        obj.print(s,n);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.print("String: ");
	String s=x.nextLine().trim();
	System.out.print("Enter Count: ");
	int n=x.nextInt();
	Name count=(String a,int b)->{ while(b-->0) System.out.println(a); };
	Main m=new Main();
	m.print(s,n,count);
	}
}
