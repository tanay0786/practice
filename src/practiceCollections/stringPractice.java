package practiceCollections;

public class stringPractice {
	
	public static void main(String [] args){
		
		
//		String str = "vhis is java";
//		String str1 = "zhis is java";
//		System.out.println(str.compareToIgnoreCase(str1));
//		System.out.println(str.replace("a","m"));
		
		StringBuilder sb = new StringBuilder("My name is Khan");
		sb.append(123);
		String s = sb.toString();
		String s1 = "My name is Khan123";
        System.out.println(sb.toString());
        String str2 = "My name is Khan123";
		System.out.println(s.compareTo(s1));
		
//		String s1 = "My name is Khan";
//		
//		char a1[] = s1.toCharArray();
//		for(int i=a1.length-1; i>=0; i--){
//			System.out.print(a1[i]);
//			
//		}
		
		
		
	}

}
