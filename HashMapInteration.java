/******************************************************************************

    HashMap iteration to print value of the map.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"Aslam");
	map.put(2,"Jameer");
	map.put(3,"Mokhesh");
	map.put(4,"Nithin");
	map.put(5,"Mouli");
	for(Integer i:map.keySet())
	    System.out.println(map.get(i));
	}
}
