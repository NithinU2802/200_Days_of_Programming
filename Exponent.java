/******************************************************************************

Exponent of the Given Number 

Input: 2 2

output: 4

Input: 2 -2

output: 0.25
       


*******************************************************************************/
import java.util.*;

class Main{
    
    public static int power(int n, int a){
        int r=1;
        for(int i=0;i<a;i++) r*=n;
        return r;
    }
    
    public static void main(String arg[]){
    Scanner x=new Scanner(System.in);
    int n=x.nextInt(),k=x.nextInt();
    if(k>=0){
        int res=power(n,k);
        System.out.print(res);
    }else{
        double res=(1.0/(power(n,k*-1)*1.0));
        System.out.print(res);
    }
    }
}
