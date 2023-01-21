package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName = "google";
		char[] charArray = companyName.toCharArray();
		Set<Character> set = new HashSet<>();
		
		for(int i=0;i<charArray.length;i++)
		{
			if(set.add(charArray[i]))
			{
				System.out.print(charArray[i]);
			}
		}

	}

}
