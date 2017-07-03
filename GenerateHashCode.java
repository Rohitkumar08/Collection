package collection;

class Emp{
	
	int age;

	public Emp(int age) {
		super();
		this.age = age;
	}
	
	public int hashCode(){
		
		return age;
		
		
	}
	
}

public class GenerateHashCode {

	
	
	public static void main(String []args){
		
		Emp e=new Emp(23);
		System.out.println(e.hashCode());
		System.out.println(System.identityHashCode(e));
		
		
	}
}
