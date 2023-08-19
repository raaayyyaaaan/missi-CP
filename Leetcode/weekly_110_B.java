package Leetcode;

import java.util.*;

public class weekly_110_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 4; int n = 4;
//		System.out.println(i);
//		System.out.println((i-1+n)%n);
//		System.out.println((i+1)%n);
		Integer[] nums = {15,11,14,1,20};
		
		List<Integer> list = Arrays.asList(nums);
		System.out.println(minimumSeconds(list));

	}
	public static int minimumSeconds(List<Integer> nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int r = 0; int win = 0; int winFreq = 0;
		for(int i : map.keySet()) {
			if(map.get(i) > winFreq) {
				winFreq = map.get(i);	
				win = i;
			}
		}
		if(map.size() == 1) return 0;
		System.out.println(win);
		int n = nums.size(); int count = 1;
		for(int i = 0; i < nums.size(); i++) {
			
			if ((nums.get(i) == win) || (nums.get((i-1+n)%n) == win) || (nums.get((i+1)%n)) == win) {
//				nums.set(i, win);
			}
			else {
				count++;
			}

		}
		return count;
        
    }

	

}
