package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "madam", reverseName = "";;
		
		char[] charArray = name.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			reverseName = reverseName+charArray[i];
		}
		if(name.equals(reverseName))
		{
			System.out.println("they are palindrome");
		}
		else
		{
			System.out.println("they are not palindrome");
		}
		
	}

}
