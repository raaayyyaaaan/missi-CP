package Leetcode;

import java.util.*;

public class Weekly_356_A {
	public static void main(String[] args) {
		int[] nums = {5,5,5,5};
		System.out.println(countCompleteSubarrays(nums));
		
	}
	public static int countCompleteSubarrays(int[] nums) {
		int count = 0;
		Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
		for(int i = set.size(); i <= nums.length; i++) {
			count += (checkArray(nums, nums, i));
		}
		return count;
		
		
	}
	public static int checkArray(int[] arr1, int[] arr2, int k) {
		int count = 0;
        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i = 0; i <= arr2.length - k; i++) {
            Set<Integer> set2 = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set2.add(arr2[j]);
            }
            if (set1.equals(set2)) {
                count++;
            }
        }
        return count;
    }

}
