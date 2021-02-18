package prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			int complement = target-nums[i];
			if (map.containsKey(complement)){
				return new int[] {map.get(complement),i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static int[] findSum(int[] arr, int n) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		//{compl,ement, currentNum}
		// {(7,2),(5,4),(3,9),()}
		// loop through the rest of the array to find the one that is in the map as key
		for (int i = 0; i < arr.length; i++) {
			int complement = n - arr[i];
			if (map.containsKey(arr[i])) {    // found
				result[0] = map.get(arr[i]);
				result[1] = arr[i];
				System.out.println(Arrays.toString(result));
				return result;
			} else {
				map.put(complement, arr[i]);
			}
		}
		return arr;
	}


	public static void main(String[] args) {
		int[] nums = {2,4,6,4,5};
		int target = 9;
		int[] res = twoSum(nums,target);
		for(int n: res){
			System.out.print(n+", ");
		}
		int[] nums2 = {1,21,3,14,5,60,7,6};
		int target2 = 81;
		findSum(nums2,target2);



	}

}
