package week3.day2;

import java.util.HashMap;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abbaba";
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		char[] charArray = input.toCharArray();
		

		for(Character i:charArray) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}
			
		}
		System.out.println(m);
	}

}
