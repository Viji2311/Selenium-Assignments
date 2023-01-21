package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> m = new TreeMap<Integer,Integer>();
		
		for(int i:input) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}else {
				m.put(i, 1);
			}
		}
		System.out.println(m);
	}

}
