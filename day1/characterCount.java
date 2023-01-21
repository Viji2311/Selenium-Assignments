package week3.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class characterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Amazon Developement Center";
		char[] charArray = text.toCharArray();
		
		Map<Character, Integer> uniqueCharacter = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<charArray.length;i++)
		{
			if(uniqueCharacter.containsKey(charArray[i])) {
				
				Integer integer = uniqueCharacter.get(charArray[i]);
				int newValue = integer+1;
				uniqueCharacter.put(charArray[i], newValue);
			}
			else {
				uniqueCharacter.put(charArray[i], 1);
			}
		}
	
		System.out.println(uniqueCharacter);

	}

}
