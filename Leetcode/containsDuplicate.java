package Leetcode;
import java.util.*;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));

	}
	public static boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
        	if (map.containsKey(i)) return true;
        	map.put(i, map.getOrDefault(i, 0) +1);
        }
		return false;
    }

}
