/*******************************************************************************
SolidRectangle

input: 4

output:

* * * *
* * * *
* * * *
* * * *

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	for(int i=0;i<n;i++){
	for(int j=0;j<n+1;j++)
	System.out.print("* "); 
	System.out.println();
	}
	}
}
