package collection;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Bookkeeping {

	public static void main(String [] args){
		
		HashSet<Book> hset = new HashSet<Book>();
		
		
		hset.add(new Book(1, "OS", "Galwin", 2));
		hset.add(new Book(2, "CN", "Forozen", 4));
		hset.add(new Book(3, "DS", "cormen", 6));
		hset.add(new Book(4, "JAVA", "ROhit", 10));
		
		for(Book b:hset){
	
			System.out.println(b.id + " "+ b.name + " "+ b.author+ " "+ b.quantity);
		}
		
		
		
		
		
		
	}
	
	
	
	
}
