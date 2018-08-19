package practiceCollections;
import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		
		String[] str = new String[]{"a","b","c","d"};
		
		//System.out.println(str);
		
		//String al = Arrays.toString(str);
		
		ArrayList<String> al1 = new ArrayList<>(Arrays.asList(str));
		
		
		al1.remove(0);
		
//		Object[] str2 = al1.toArray();
	//	System.out.println(str2);
		System.out.println(al1);
		
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(1);
//		al.add(2);
//		ArrayList<Integer> al2 = new ArrayList<>();
//		al2.add(5);
//		al2.add(7);
//		al2.add(2);
//		al2.add(1);
//		System.out.println(al2);
//		al2.removeAll(al);
//		System.out.println(al2);
		
		

	}

}
