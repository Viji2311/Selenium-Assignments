package week1.day1;

public class fibonacci {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=11;
		int firstNum=0;
		int secNum=1;
		
		for(int i=1;i<=n;++i)
		{
			System.out.println(firstNum+",");
			
		
		int sum = firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		
		}
	}

}
