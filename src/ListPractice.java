import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListPractice {

	public static void main(String[] args) {
		
		
		String[] s1 = new String[]{"amir","C","C++","Tanay","amir",};
//		List list = Arrays.asList(s1);
//		Set set = new HashSet<>(list);
//		
//		System.out.println(list);
//		System.out.println(set);
		
		int len=s1.length;
		for(int j=0;j<len;j++){
			for(int k=j+1;k<len;k++){
				if(s1[j].equalsIgnoreCase(s1[k])){
					System.out.println("Arrays has duplicate elements");
					System.out.println("\n"+s1[j]);
					break;
				}
			}
		}

	}

}
