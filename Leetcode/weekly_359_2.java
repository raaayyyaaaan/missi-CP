package Leetcode;

import java.util.HashMap;

public class weekly_359_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2; int k = 6;
		System.out.println(minimumSum(n, k));

	}
    public static int minimumSum(int n, int k) {
    	int sum = 0;
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int i = 0;
    	while (map.size()<n) {
    		i++;
    		int target = k - i;
    		if (map.containsKey(target)) continue;
    		map.put(i, 0);
    		sum += i;
    	}
    	
		return sum;
    
    }


}
