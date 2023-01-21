package week1.day2;

public class reversestring {

	public static void main(String[] args) {
		
		String name = "vijaya";
		
		char[] charArray = name.toCharArray();
		
		for(int i=charArray.length-1;i>0;i--)
		{
			System.out.print(charArray[i]);
		}
		

	}

}
