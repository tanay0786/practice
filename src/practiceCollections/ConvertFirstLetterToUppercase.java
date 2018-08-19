package practiceCollections;

public class ConvertFirstLetterToUppercase {

	public static void main(String[] args) {
		
		
		String s1 = "my name is khan";
		
		String[] arr = s1.split(" ");
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1)+" ");
		}

	}

}
