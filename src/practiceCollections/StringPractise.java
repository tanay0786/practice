package practiceCollections;

public class StringPractise {

	public static void main(String[] args) {

		String Str = "my name is khan";

		String[] arr = Str.split(" ");
		for (int i = 0; i <= arr.length - 1; i++) {
			//System.out.println(arr[i]);
			
			String capletter = Character.toUpperCase(arr[i].charAt(0))+ arr[i].substring(1)+" ";
			System.out.print(capletter);
			
			
		}

	}

}
