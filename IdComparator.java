package collection;

import java.util.Comparator;

public class IdComparator implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub\
		
		if(o1.empId>o2.empId)
			return 1;
		else if(o1.empId<o2.empId)
			return -1;
		
		else
			 return 0;

	}

}
