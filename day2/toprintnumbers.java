package week1.day2;

public class toprintnumbers {

	public static void main(String[] args) {
		
		String name= "Amazon has 11400 employees in chennai";
       
		String num = name.replaceAll("\\D", "");
		
		System.out.println(num);
		
		
	}

}
