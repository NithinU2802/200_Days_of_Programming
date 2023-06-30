/******************************************************************************

    Addition and Multiplication Operation using lambda function.
    
Input:
5 6

Output:
Addition: 11
Multiply: 30

*******************************************************************************/
import java.util.*;

public class Main
{
    interface Opt{
        int operation(int a,int b);
    }
    
    private int operator(int a,int b,Opt obj){
        return obj.operation(a,b);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	Opt add=(int a,int b)->a+b;
	Opt multiply=(int a,int b)->a*b;
	Main m=new Main();
	int a=x.nextInt();
	int b=x.nextInt();
	System.out.println("Addition: "+m.operator(a,b,add));
	System.out.println("Multiply: "+m.operator(a,b,multiply));
	}
}
