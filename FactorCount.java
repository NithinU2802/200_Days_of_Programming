/******************************************************************************

    count the factors that are divisable by n.
    
Input:
10

Output:
4

Input:
50

Output:
6

*******************************************************************************/
import java.util.*;

public class Main
{
    public static int factorCount(int n){
        int count=0;
        for(int i=1;i*i<=n/2;i++){
            if(n%i==0){
                count++;
                if(i*i!=n)
                    count++;
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	System.out.println(factorCount(n));
	}
}
