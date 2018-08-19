package practiceCollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		int[] arr ={2,3,1,5,67,5,654};
		System.out.println("Enter element to be searched");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(reader.readLine());
		
		
		for(int i=0; i<=arr.length-1; i++){
			if(arr[i]==m){
				System.out.println(i);
			}
			
			
		}
	}

}
