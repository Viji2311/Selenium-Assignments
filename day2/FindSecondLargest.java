package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	
	public static void main(String[] args) {
		
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> s = new TreeSet<>();
		for(int i=0;i<data.length;i++)
		{
			s.add(data[i]);
		}
		List<Integer> sd = new ArrayList<>(s);
		Collections.sort(sd);
		System.out.println(sd);
		
		System.out.println("The Second largest element is"+ sd.get(sd.size()-2));

	}

}
