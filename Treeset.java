package collection;
import java.util.*;  
import java.util.Scanner;

public class Treeset {
	
	
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		String[] arr=s.split(" ");
		
		TreeSet<String> al=new TreeSet<>();  
		for(String str:arr){
			
			al.add(str);
			System.out.println(al);
			
		}
		System.out.println(al);
		
}
	

}
