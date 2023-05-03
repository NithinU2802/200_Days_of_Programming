/******************************************************************************

Implementation of linked list to print elements..!

Input:
4
1 2 3 4

Output:
1 2 3 4

*******************************************************************************/

import java.util.*;

public class Main
{
    
    static class Linked{
        int val;
        Linked next;
        Linked(int d){
            val=d;
            next=null;
        }
    };
    
    public static void print(Linked a){
        while(a!=null){
            System.out.print(a.val+" ");
            a=a.next;
        }
    }

    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),k;
	Linked head=null,pre=null;
	
	for(int i=0;i<n;i++){
	k=x.nextInt();
	Linked a=new Linked(k);
	if(i==0){
	    head=a;
	    pre=a;
	}else{
	    pre.next=a;
	    pre=a;
	}
	}
	
	print(head);
	
	}
}
