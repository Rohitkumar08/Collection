package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



class EmployeeData{
	
	int empId;
	String empName;
	public EmployeeData(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeData other = (EmployeeData) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
	
}

public class HashCodeImplementation {
	
	public static Map<EmployeeData, String> getData(){
		
		EmployeeData e1= new EmployeeData(100, "Anand");
		EmployeeData e2= new EmployeeData(103, "this");
		EmployeeData e3= new EmployeeData(298, "hfbew");
		EmployeeData e4= new EmployeeData(363, "sjhgbdv");
		
		Map<EmployeeData, String> hset = new HashMap<EmployeeData, String>();
		
		hset.put(e1, "manoj");
		hset.put(e2, "Ram");
		hset.put(e3, "Hulk");
		hset.put(e4, "mario");
		
		return hset;

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<EmployeeData, String> hmap = getData(); 
		
		EmployeeData eNew = new EmployeeData(103, "this");
		
		String e = hmap.get(eNew);
		System.out.println(e);

	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
