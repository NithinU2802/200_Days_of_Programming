/******************************************************************************

You are camping in a forest area at night. You are living with the forest officers
to experience their challenges and hardships to create a documentary on them. 
Everything was going well. Suddenly, a fire has broken out in the forest and it 
is expanding exponentially. There is a lot of chaos and cries of animals. It is 
going to take alot of time for the backup. Some of the posts in the forest have 
also caught fire. The officers are trying everything to safeguard the animals but 
the fire is spreading too fast. Amid such chaos, the petrol tankers of the officers
have also caught fire. The fire is unstoppable now and the commanding officer is
taking important decisions with his officers.


The officers know the energy levels of all the N animals in the forest at the moment. 
It is a tough decision for them as they can only save exactly X animals because of 
the current situation of the transports they have. Since, the animals are pride of 
the forest, the energy level of the animals are represented with P. All the animals 
with energy level equal to P or greater than P can board the available transports and 
they will be moved to a safer place. But since the capacity is for exactly X animals 
it is going to be tough to figure out.


Officer needs your help to figure out the minimum energy level P such that they 
can get exactly X animals to transport. If it is not possible to save exactly X 
animals, then you should respond with -1 so that they can think of some other plan. 
The officers are busy trying to get control of the fire and are counting on you to 
figure out the minimum P to save and transport exactly X animals. 



Example:

Number of animals, N = 5

Energy level of N animals = { 1, 3, 2, 4, 5 }

Current available capacity, X = 4

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),k=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	a[i]=x.nextInt();
	Arrays.sort(a);
	int c=0,i;
	for(i=n-1;i>=0;i--){
	c++;
	if(c==k) break; 
	}
	if(c==k)
	System.out.print(a[c-1]);
	else
	System.out.print("-1");
	}
}
