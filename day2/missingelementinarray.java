package week1.day2;

import java.util.Arrays;

public class missingelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		n=arr.length+1;
		int sumofAll = (n*(n+1))/2;
		int sumofArray =0;
		for (int i=0;i<=arr.length-1;i++)
		{
			sumofArray = sumofArray+arr[i];
		}
		int missingNumber =sumofAll-sumofArray;
		System.out.println("The missing Number:"+missingNumber);
		
}
}