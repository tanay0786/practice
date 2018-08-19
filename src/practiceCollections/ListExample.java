package practiceCollections;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		
	ArrayList<String> al = new ArrayList<>();
	al.add("Tanay");
	al.add("ram");
	al.add("Shyam");
	al.add("Shyam");
	
	System.out.println(al.get(2));
	
	ListIterator<String> ls = al.listIterator();
	while(ls.hasNext()){
		
		System.out.println(ls.next());
	}
		
	while(ls.hasPrevious()){
		
		System.out.println(ls.previous());
	}
		

	}

}
