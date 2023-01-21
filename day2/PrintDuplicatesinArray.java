package week1.day2;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int lengths = arr.length;
		
	
		int count =0;
		for(int i=0;i<lengths-1;i++)
		{
			
			for(int j=i+1;j<lengths-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count=count+1;
					System.out.println("The matching numbers"+arr[i]);
				}
			}
		}
	}

}
