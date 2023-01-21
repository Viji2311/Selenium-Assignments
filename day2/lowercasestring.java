package week1.day2;

public class lowercasestring {

	public static void main(String[] args) {
		
		String name = "Amazon developement center, Chennai";
        String cname = name.toLowerCase();
		String[] words = cname.split(" ");
		
		System.out.println(words.length);
		
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(" "+words[i]);
		}
		
		
		
		
		
		
		
	}

}
