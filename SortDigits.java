/******************************************************************************

Sort the given digit and create a digit.....

Input: 4564

output: 4456

Input: 38627

Output: 23678

*******************************************************************************/
import java.util.*;
public class Main
{
    
    public static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String n=x.nextLine();
	int[] a=new int[n.length()];
	int t=Integer.parseInt(n),k=0;
	while(t!=0){
	    a[k++]=t%10;
	    t/=10;
	}
	sort(a);
	String r="";
	for(int i: a) r+=String.valueOf(i);
	System.out.print(r);
	}
}
