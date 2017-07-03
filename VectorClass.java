package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
public static void main(String []args){
	
	Vector<String> v = new Vector<>();
	v.add("rohit");
	v.add("sfbv ");
	v.add("lvnrle");
	v.add("krfjlr");
	
	Enumeration e=v.elements();
	
	while(e.hasMoreElements()){   //it is used for accessing the more elements
		
		System.out.println(e.nextElement());  //nextElement method is used to access the next elements
		
	}
		
}
}
