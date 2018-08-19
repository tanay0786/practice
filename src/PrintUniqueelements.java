import java.util.ArrayList;
import java.util.List;

import practiceCollections.Arraylist;

public class PrintUniqueelements {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };

		int[] arr2 = { 1, 2, 3 };
		
	//	List<Integer> l1 = new ArrayList<>();

		boolean b = false;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					b = true;
					break;

				}

			}
			if(!b){
				
				
			}
		}

	}

}
