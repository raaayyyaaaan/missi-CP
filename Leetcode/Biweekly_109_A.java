package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Biweekly_109_A {
public static void main(String[] args) {
	int[] nums = {2, 1, 3};
	System.out.println(isGood(nums));
	
}
	public static boolean isGood(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(nums);
		int max = nums[nums.length-1];
		if (nums.length != max + 1) return false;
		
		System.out.println(max);
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for ( int i = 1; i < max; i++) {
			if (!map.containsKey(i)) return false;
		}
		if (map.get(max) != 2) return false;
		return true;
        
    }

	
}
