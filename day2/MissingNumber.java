package week3.day2;



import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class MissingNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= { 1,3,4,3,5,4,6,7,8,6,9,10};
		
		Set<Integer> s = new HashSet<Integer>();
		
		Collections.addAll(s, arr);
		System.out.println(s);
		
		for(int i=0;i<s.size();i++)
		{
			if(arr[i]==arr[i+1]) {
				
				System.out.println("The missing number is"+arr[i]);
				
			}
				
		}
		
		
		
		
	}

}
