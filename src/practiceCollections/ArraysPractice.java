package practiceCollections;

public class ArraysPractice {

	public static void main(String[] args) {
	
		String[] arr1 = new String[] {"a","b","c"};
		String[] arr2 = new String[5];
		
		arr2[3]="D";
		arr2[4]="E";
		System.arraycopy(arr1, 0, arr2, 0, 3);
		for(int i=0;i<arr2.length;i++){
		System.out.println(arr2[i]);}

	}

}
