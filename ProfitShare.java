/******************************************************************************

In daily share trading, a buyer buys shares in the morning and sells them on the
same day. If the trader is allowed to make at most 2 transactions in a day, the 
second transaction can only start after the first one is complete (Buy->sell->
Buy->sell). Given stock prices throughout the day, find out the
maximum profit that a share trader could have made.

Examples: 

Input:   
6 
10 20 5 75 65 80

Output:  87
Trader earns 87 as sum of 10, 75 
Buy at 10, sell at 20, 
Buy at 5 and sell at 80

Input:
7 
2 30 15 10 8 25 80
Output:  100
Trader earns 100 as sum of 28 and 72
Buy at price 2, sell at 30, buy at 8 and sell at 80

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static int maxProfit(int[] a,int n){
        int[] profit=new int[n];
        int max=a[n-1];
        /* 
        Explaination:
                               profit 
        10 20 5 75 65 80 -> 0 0 0 0 15 0 
                         -> 0 0 0 15 15 0
                         -> 0 0 75 15 15 0 
                         -> 0 75 15 15 15 0 
                         -> 75 75 15 15 15 0 
        
        */
        for(int i=n-2;i>=0;i--){
            if(max<a[i])
            max=a[i];
            profit[i]=Math.max(profit[i+1],max-a[i]);
        }
        
        /*
        Explaination:
        profit-> 75 75 15 15 15 0 
        
                             profit
        10 20 5 75 65 80-> 75 0 0 0 0 0 
                        -> 75 85 0 0 0 0 
                        -> 75 85 85 0 0 0 
                        -> 75 85 85 85 0 0 
                        -> 75 85 85 85 85 85
        Now ans is 85..
        */
        
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i])
            min=a[i];
            profit[i]=Math.max(profit[i-1],profit[i]+(a[i]-min));
        }
        return n-1;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	System.out.print(maxProfit(a,n));
	}
}
