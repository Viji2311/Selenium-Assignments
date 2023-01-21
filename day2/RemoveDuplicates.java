package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "PayPal India";
		String lowerCase = text.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		
		Set<Character> charSet =new LinkedHashSet<>();
		
		Set<Character> dupCharSet = new LinkedHashSet<>();
		
		for(int i=0;i<charArray.length;i++)
		{
			
			 charSet.add(charArray[i]);
			if(charSet.contains(charArray[i])) {
			   
			    dupCharSet.add(charArray[i]);
		}
			else if(dupCharSet==charSet) {
				charSet.remove(charArray[i]);
			}
			Iterator<Character> iter = charSet.iterator();
			
			if(!iter.equals(" ")) {
				System.out.println(charSet);
			}
			
	}

}
}