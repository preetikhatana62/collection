package freshPrograms;

import java.util.Iterator;
import java.util.Stack;


public class main {

	public static void main(String[] args) {
		 
	Stack<String> st=new Stack<String>();
	st.push("preeti");
	st.push("khushi");
	st.push("deepak");
	st.push("akash");
	//st.pop();
	Iterator<String> iterator =st.iterator();
	   // iterator.forEachRemaining((e)->{System.out.println(e);});
	    while(!(st.empty()))
	    {iterator.forEachRemaining((e)->{System.out.println(e);});
	    	st.pop();
	    }
	
	}

}
