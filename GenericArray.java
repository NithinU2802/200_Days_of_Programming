/******************************************************************************

Write a Java program to create a generic method that takes two arrays of the same
type and checks if they have the same elements in the same order.

Input:
size of arrays: 4
Java Python
java mark
Java Python

Output:
String 1 and 2: false
String 1 and 3: true

*******************************************************************************/
import java.util.*;

public class Main
{
    public static <T> boolean compare(T[] a,T[] b){
        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i])) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.print("Size of arrays: ");
	int n=x.nextInt();

	
	String[] d=new String[n];
	String[] e=new String[n];
	String[] f=new String[n];
	
		
	x.nextLine();
	for(int j=0;j<n;j++) d[j]=x.next();
	x.nextLine();
	for(int j=0;j<n;j++) e[j]=x.next();	
	x.nextLine();
	for(int j=0;j<n;j++) f[j]=x.next();	
	x.nextLine();
	
	System.out.println("String 1 and 2: "+compare(d,e));
	System.out.println("String 1 and 3: "+compare(d,f));
	}
}
