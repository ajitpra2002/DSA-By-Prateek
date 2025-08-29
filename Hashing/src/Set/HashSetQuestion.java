package Set;

import java.util.HashSet;

/*
 * find all pair which sum is equal to given target of Time com=O(n)
 */
public class HashSetQuestion {
	public static void main(String[] args) {
		int arr[]= {2,1,8,6,-2,5,3,0};
		findPair(arr, 8);
	 
	}
	public static void findPair(int arr[],int target) {
		HashSet<Integer> set =new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(target-arr[i])) {
				System.out.println("pair is ["+( target-arr[i])+","+arr[i]+"]");
			}
			set.add(arr[i]);
		}
	}

}
