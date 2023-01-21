package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s = new ArrayList<String>();
		s.add("HCL");
		s.add("Wipro");
		s.add("Aspire Systems");
		s.add("CTS");
		
		System.out.println("The length of the array"+ s.size());
		
		Collections.sort(s);
		for(int i=s.size()-1;i>=0;i--)
		{
			System.out.println("The array is"+ s.get(i));
		}
		
	}
		
}		
	

