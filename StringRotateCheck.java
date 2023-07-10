/******************************************************************************

    check whether clockwise or anti-clockwise of a given string is equal to 
the string 2nd then print YES else NO.

Input:
Nithin
inNith
2 

Output:
YES 

Input:
watermelon
rmelonwate
34

Output:
YES 


Input:
Avamax
xAvama
4 

Ouput:
NO


*******************************************************************************/
import java.util.*;

public class Main
{
    public static String clockWise(char[] a,int n){
        int m=a.length;
        char t;
        while(n>0){
            t=a[m-1];
            for(int i=m-1;i>0;i--)
            a[i]=a[i-1];
            a[0]=t;
            n--;
        }
        return new String(a);
    }
    
    public static String antiClockWise(char[] a,int n){
        int m=a.length;
        char t;
        while(n>0){
            t=a[0];
            for(int i=0;i<m-1;i++)
            a[i]=a[i+1];
            a[m-1]=t;
            n--;
        }
        return new String(a);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s1=x.nextLine();
	String s2=x.nextLine();
	int n=x.nextInt();
	if(clockWise(s1.toCharArray(),n).equals(s2) || antiClockWise(s1.toCharArray(),n).equals(s2))
	System.out.println("YES");
	else
	System.out.println("NO");
	}
}
