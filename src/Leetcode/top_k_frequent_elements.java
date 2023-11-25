package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class top_k_frequent_elements {

		public static int[] topKFrequent(int[] nums, int k) {
	        int[] res = new int[k];
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i : nums){
	            map.put(i, map.getOrDefault(i, 0) +1);
	        }
	        int highestValue = 0;
	        int highestKey = 0;
	        while (k-- > 0){
	            for (int i : map.keySet()){
	                if (map.get(i) > highestValue) {
	                	highestValue = map.get(i);
	                	highestKey = i;
	                }
	            }
	            map.remove(highestKey);
	            res[k] = highestKey;
	            highestValue = 0;
	        }
	        return res;
	    }

    public static void main(String[] args) {
    	int[] nums = {1,1,1,2,2,3};
    	int k = 2;
    	System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}


	

}
