package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class ApostekEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<EmployeeDetails> arr= new ArrayList<>();
		
		arr.add(new EmployeeDetails(1,"A"));
		arr.add(new EmployeeDetails(2, "B"));
		arr.add(new EmployeeDetails(3, "C"));
		arr.add(new EmployeeDetails(4, "D"));
		arr.add(new EmployeeDetails(5, "E"));
		
		Collections.sort(arr, new IdComparator());
		Iterator<EmployeeDetails> itr = arr.iterator();
		
		while(itr.hasNext()){
			EmployeeDetails e1= itr.next();
			System.out.println(e1.empId+ " "+ e1.empName);
			
			
		}
		
		
		

	}


}
