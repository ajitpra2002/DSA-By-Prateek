package V1;

import java.util.Arrays;


/*
 * Problem Definition
We are given an array of distinct integers.
We need to find the length of the highest mountain.
A mountain =
A subarray where:
Numbers strictly increase until they reach a peak.
After the peak, numbers strictly decrease.
Must contain at least 3 elements.
Input:
[2, 1, 4, 7, 3, 2, 5]
[1, 4, 7, 3, 2] is a mountain of length 5
[2, 5] is not a mountain (too short)
 Output = 5
 Efficient Solution (O(n) time, O(1) space)
 */
public class Mountain06 {
	public static void main(String[] args) {
//		int arr[] = { 5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4 };
		int arr1[] = {2,1,4,7,3,2,5};
		System.out.println(findlargestMountain(arr1));

		
		int arr2[] = {2,2,2}; 
		System.out.println(findlargestMountain(arr2));

		
		int arr3[] = {5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
		System.out.println(findlargestMountain(arr3));

		
		int arr4[] = {1,2,3,4,5};
		System.out.println(findlargestMountain(arr4));

//		System.out.println(Arrays.toString(arr));
//		System.out.println(findlargestMountain(arr));
	}

	public static Integer findlargestMountain(int arr[]) {
		int largestMountain = 0;
		for (int i = 1; i <= arr.length - 2;i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				int left=i-1;
				int right=i+1;
				while (left>0 && arr[left] > arr[left - 1]  ) {
					left--;
				}
				while (right<=arr.length-2 && arr[right] > arr[right + 1]) {
					right++;
				}
				int currentMount=right-left+1;
				largestMountain = Math.max(largestMountain, currentMount);
				
				i=right;
			}  
			
		}
		return largestMountain;

	}

}
