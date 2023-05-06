/******************************************************************************

Calculate the power of a^b for the given input...!

Input:
2 4

Output: 16

Input:
5 2

Output: 25

*******************************************************************************/
import java.util.*;

public class Main
{
    public static int pow(int a,int b){
        if(b==0) return 1;
        int r=1;
        while(b>0){
            if((b&1)==1) r*=a;
            a*=a;
            b>>=1;
        }
        return r;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	System.out.println(pow(a,b));
	}
}
