package V1;
/*
 * Implement a function that takes an input a vector of integers, 
 * and prints the maximum subarray sum that can be formed. 
 * A subarray is defined as consecutive segment of the array. 
 * If all numbers are negative, then return 0.

Input

{-1,2,3,4,-2,6,-8,3}
Output

13
 */
public class Maximum_Subarray_Sum10 {
	public static void main(String[] args) {
		int arr[]={-1,2,3,4,-2,6,-8,3};
		System.out.println(findMaxSubArraySum(arr));
	}
	public static int findMaxSubArraySum(int arr[]) {
		int currentSum=0;
		int MaxSum=0;
		for(int i=0;i<arr.length;i++)
		{
			currentSum=currentSum+arr[i];
			MaxSum=Math.max(MaxSum, currentSum);
			if(currentSum<0)
				currentSum=0;
		}
		return MaxSum;
	}

}
