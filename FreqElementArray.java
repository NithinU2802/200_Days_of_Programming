/******************************************************************************

Print the frequency of the elements in the array 


Input: 7
2 3 4 2 2 5 5 

output: 2(3) 3(1) 4(1) 5(2)


*******************************************************************************/
import java.util.*;

public class Main
{
    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
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
	int n=x.nextInt(),t;
	int[] a=new int[1001];
	int[] b=new int[n];
	for(int i=0;i<n;i++) b[i]=x.nextInt();
	sort(b);
	int[] r=new int[n];
	int m=0,p=b[0];
	a[b[0]]++;
	r[m++]=b[0];
	for(int i=1;i<n;i++){
	    a[b[i]]++;
	    if(b[i-1]<b[i]) r[m++]=b[i];
	}
	for(int i=0;i<m;i++) System.out.print(r[i]+"("+a[r[i]]+")"+" "); 
	}
}
