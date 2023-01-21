package week2.day2;

public class repeatednumbers {

	@SuppressWarnings("unused")
	public static boolean repeatednumb(int[] arr) {
		// TODO Auto-generated method stub
		
		
		
		int count =0;
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
				if(count==1)
				return true;
				
			}
		}
		return false;
	}

		public static void main(String[] args) {
			int[] arr1 = {1,2,3,4,5,1,2};
			System.out.println(repeatednumb(arr1));
			
		}
		

	}


