package V1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/*
 * Given an array of integers, find the length of the longest band.
A band = a subsequence that can be reordered so that all elements appear consecutive (i.e., difference of 1 between neighbors).
We want the maximum length band.
🔹 Example
Input:
[1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6]
Step-by-step:
Bands are:
[0,1,2,3,4,5,6,7] → length 8
[9,10] → length 2
[12] → length 1
[18] → length 1
✅ Longest band = 8.
Output:
8
solve in Optimized Solution (O(n) time, O(n) space)
 */
public class LongestBand07 {

	public static void main(String[] args) {
//		int arr[]= {1,9,3,0,18,5,2,4,10,7,12,6};
//		System.out.println(findLongestBand3(arr));
//		int arr[] = {100, 4, 200, 1, 3, 2};
//		System.out.println(findLongestBand2(arr));
//		int arr[] = {10, 5, 30, 20};
//		System.out.println(findLongestBand2(arr));
		int arr[] = { 5, 6, 7, 8 }; // duplicates included
		System.out.println(findLongestBand2(arr));
//		int arr[] = {};
//		System.out.println(findLongestBand2(arr));
//		int arr[] = {7};
//		System.out.println(findLongestBand2(arr));

	}

//	using brute force O(n^2)
	public static Integer findLongestBand(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int LongestContaingingConsecutivecount = 0;
				if (arr[i] = arr[j] + 1) {

				}
			}
		}

	}

	public static Integer findLongestBand1(int arr[]) {

	}

//using shorting O(nlogn)
	public static Integer findLongestBand2(int arr[]) {
		Arrays.sort(arr);
		int count = 1;
		int largest = 1;
		if (arr.length == 1) {
			return 1;
		}
		if (arr.length == 0) {
			return 0;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				continue;
			} else if (arr[i] == arr[i + 1] - 1) {
				count++;
			} else {
				largest = Math.max(largest, count);
				count = 1;
			}
		}
		largest = Math.max(largest, count);

		return largest;
	}

	// otimal solution using hashset Data Structure
	public static Integer findLongestBand3(int arr[]) {
		Set<Integer> s = new HashSet<Integer>();
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int k = arr[i];
			if (!s.contains(k - 1)) {
				int count = 1;
				while (s.contains(k + 1)) {
					count++;
					k++;
				}
				largest = Math.max(largest, count);
			}
		}
		return largest;
	}
	/*
	 * Time Complexity: Inserting into HashSet → O(n) Outer loop runs O(n) Inner
	 * while loop runs at most O(n) overall (since each element is processed once
	 * across all bands)
	 * 👉 Overall = O(n) average time.
	 */
}
