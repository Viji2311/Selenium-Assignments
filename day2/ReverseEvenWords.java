package week1.day2;

import org.apache.poi.hpsf.Array;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="I am a software tester";
		String[] word = test.split(" ");
		String newword ="";
		for(int i=0;i<word.length;i++)
		{
			if(i%2!=0)
			{
				newword = newword + word[i];
				
				for(int j=newword.length()-1;j>0;j--)
				{
			       if(j%2==0)
			       {
					char[] charArray = newword.toCharArray();
					System.out.print("The reversed String : "+ charArray[i]);
					
					}
				}
				
			}
		}

	}

}

