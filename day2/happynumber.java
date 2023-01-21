package week1.day2;

public class happynumber {

	public static int isHappyNumber(int num) {
		
		int rem =0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem);
			num = num%10;
			
		}
		return sum;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num=82;
		int result=num;
		
		while(result!=1 && result!=4) {
		result = isHappyNumber(result);
		}
		 if(result==1) {
			 System.out.println(num + "is happy number");
		 }
		 else if(result==4)
		 {
			 System.out.println(num+"is not a happy number");
		 }
		
			
		
	}
	

}
