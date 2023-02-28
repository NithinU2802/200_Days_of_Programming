import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) a[i]=x.nextInt();
	int k=x.nextInt();
	Arrays.sort(a);
	for(int i=n-1;i>=0;i--)
	if(a[i]%10==k){ 
	    System.out.println(a[i]);
	    break;
	}
	for(int i=0;i<n;i++)
	if(a[i]%10==k){ 
	    System.out.println(a[i]);
	    break;
	}
	
	}
}
