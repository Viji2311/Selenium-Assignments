package week1.day1;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		boolean flag = false;
		for(int i=2;i<n/2;++i)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			if(!flag)
				System.out.println(n+"is prime number");
			else 
				System.out.println(n+"not a prime number");
		}

	}

}
