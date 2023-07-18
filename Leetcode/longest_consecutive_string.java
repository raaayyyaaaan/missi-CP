package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class longest_consecutive_string {
	
	
	public static void main(String[] args) {
//		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		int[] nums = {100,4,200,1,3,2};
//		int[] nums = {0};
		
		System.out.println(longestConsecutive(nums));
		
	}
	public static int longestConsecutive(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, 1);
		}
		int count = 1; int res = 0;
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]-1)) {
				count = 1;
				int j = 1;
				while(map.containsKey(nums[i]+j)) {
					count++;
					j++;
				}
				res = Math.max(res, count);
			}
		}
		return res;
		
	}
//    

            	
                
}