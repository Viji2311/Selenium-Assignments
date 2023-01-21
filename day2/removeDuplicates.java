package week1.day2;

public class removeDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
	
		String[] word = text.split(" ");
		for(int i=0;i<word.length;i++)
		{
			
			for(int j=i+1;j<word.length;j++)
			{
				count=count+1;
				String newText= text.replace(word[i],"");
			    System.out.println(newText);
				}			
		}
	}

}

