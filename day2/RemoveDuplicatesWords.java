package week3.day2;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text ="We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> s = new LinkedHashSet<>();
		for(int i=0;i<split.length;i++)
		{
			
			if(!(s.contains(split[i]))) {
				s.add(split[i]);
			}
		}
		System.out.print("The string is:"+ s);
					
		
	}

}
