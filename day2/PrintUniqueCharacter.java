package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text ="Vijayalakshmi";
		char[] charArray = text.toCharArray();
		Set<Character> s = new HashSet<>();
		Set<Character> s1 = new HashSet<>();
		
		for(int i=0;i<charArray.length;i++) {
			if(s.contains(charArray[i])) {
				s.add(charArray[i]);
				s1.remove(charArray[i]);
			}
			else {
				s.add(charArray[i]);
				s1.add(charArray[i]);
			}
			
		}
		System.out.println(s1);
		
	}

}
