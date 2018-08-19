package practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, };
		boolean contains = false;
		List<Integer> l1 = new ArrayList<>();

		int[] arr2 = { 1, 2, 3, };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if ((arr1[i] == arr2[j])) {

					contains = true;
					break;
				}

			}
			if (!contains) {

				l1.add(arr1[i]);

			} else {
				contains = false;
			}

		}
		System.out.println(l1);

	}

}
