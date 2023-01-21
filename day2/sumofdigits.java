package week1.day2;

public class sumofdigits {

	public static void main(String[] args) {
		 
		String text = "Tes12Le79af65";
		int sum = 0;
		text.replaceAll("\\D", "");
		char[] charArray = text.toCharArray();

		for(int i=0;i<charArray.length;i++)
		{
			int count = Character.getNumericValue(i);
			sum = sum+count;
			
		}
		System.out.println(sum);
	}

}
