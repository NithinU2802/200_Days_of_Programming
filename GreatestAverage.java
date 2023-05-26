/******************************************************************************

 Write a Java program that finds numbers greater than the average of an array.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
The average of the said array is: 22.0
The numbers in the said array that are greater than the average are:
25 100

*******************************************************************************/
import java.util.*;

public class Main
{
    public static float average(int[] a){
        float s=0;
        for(int i=0;i<a.length;i++) s+=a[i];
        s/=(a.length*1.0);
        return s;
    }
    
    public static void greaterAverage(int[] a,float avg){
        Arrays.sort(a);
        int i=0;
        for(i=0;i<a.length;i++)
            if(a[i]>avg) break;
        if(i==a.length) System.out.println("-1");
        else 
        for(;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	float avg=average(a);
	System.out.println(String.format("The average of the said array is: %.1f",avg));
	System.out.print("The numbers in the said array that are greater "+
	"than the average are: ");
	greaterAverage(a,avg);
	}
}
