/******************************************************************************

String append in java.

Input:
Nithin
from 
Trichy

Output:
Nithin from Trichy

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	StringBuffer b=new StringBuffer();
	for(int i=0;i<3;i++)
	b.append(x.nextLine()+" ");
	System.out.println(b.toString());
	}
}
