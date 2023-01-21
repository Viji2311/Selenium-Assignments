package week1.day2;

public class expectedvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "hexaware";
		char[] charArray = name.toCharArray();
		char target = 'e';
		int count =0;
		for(int i=0;i<charArray.length;i++)
		{
			
			if(charArray[i]==target)
			{
				count++;
			
			}
			
		}
		
		System.out.println(count);
	}

}
