/******************************************************************************

Storing ArrayList in a Set....!

Input:
1

Output:
[[5, 2, 3, 6], [3, 2, 4, 8]]

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in); 
	 
	Set<List<Integer>> set=new HashSet<>();
	
	// list to add in set
	
	// list 1
	List<Integer> list=new ArrayList<>(List.of(3,2,4,8));
	set.add(list);
	
	// list 2
	list=new ArrayList<>(List.of(5,2,3,6));
	set.add(list);
	
	// list 3 Never mind already available
	list=new ArrayList<>(List.of(3,2,4,8));
	set.add(list);
	
	// Output
	int n=0;
	while(n!=1){
	n=x.nextInt();
	if(n==1)
	System.out.print(set);
	else System.out.println("Please Enter One...!");
	}
	
	}
}
