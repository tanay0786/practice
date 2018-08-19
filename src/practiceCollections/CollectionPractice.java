package practiceCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionPractice {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("1", "Tanay");
		map.put("2", "Shyam");
		map.put("3", "salman");
		
		for(Map.Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		
//		Set<String> keys = map.keySet();
//		
//		for(String S:keys){
//			
//			System.out.println(S + " " +map.get(S));
//			
		}

		

	}

}
