package week1.day2;

import java.util.Arrays;

public class majorityelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2,2,2,1,3,4,2,5};
		Arrays.sort(nums);
		int n=nums.length;
		int maxCount =0;
		int reset = -1;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount=count;
				reset=i;
			}
		}
		System.out.println(nums[reset]);
	}

}
