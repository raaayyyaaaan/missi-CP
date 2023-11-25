package Leetcode;

import java.util.HashMap;

public class GFG_114_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(beautifulNumber(2));
//		System.out.println(9/10);

	}
    public static boolean beautifulNumber(int n) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int num = n;
    	while(!map.containsKey(num)) {
    		map.put(num, 1);
    		int sum = 0;
    		while(num != 0) {
    			sum += Math.pow((num%10), 2);
    			num = num/10;
    		}
    		num = sum;
//    		System.out.println(num);
    		if(num == 1) return true;
    		
//    		
    	}
		return false;
        // Your code here
    }

}
