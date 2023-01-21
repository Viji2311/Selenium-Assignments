package week1.day2;

public class lengthoflaststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "fly me to the moon";
		
		String trim = text.trim();
		int len=0;
		for (int i=0;i<trim.length();i++)
		{
			if(trim.charAt(i)==' ')
			{
				len=0;
		     }
		else
		{
			len=len+1;
		}
			
			System.out.println("The length of last string" + len);
		
		
		}

	}

}
