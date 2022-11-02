package freshPrograms;

import java.util.HashMap;
import java.util.*;

public class access {
	public static void main(String[] args) {
		Map<Integer,user> u1=new HashMap<Integer,user>();
		u1.put(1, new user(12343,"preeti"));
		u1.put(4, new user(1765,"shivani"));
		System.out.println(u1.get(4).name);
		System.out.println(u1.get(1).phno);
		System.out.println(u1.containsKey(4));
	    Set<Integer>key=u1.keySet();
	     Iterator<Integer> iterator =key.iterator();
	     /*while(iterator.hasNext())
	     {
	    	 System.out.println(iterator.next());
	     }*/
	    
	   
	    
	}

}