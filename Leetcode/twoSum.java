package Leetcode;
import java.util.*;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {3,3}; int t = 6;
		System.out.println(Arrays.toString(twoSum(n, t)));

	}
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int j = 0;
		for(int i : numbers) {
			map.put(i,j);
			j++;
		}
		int[] c = new int[2];
		for(int i = 0; i < numbers.length; i++) {
			int a = target - numbers[i];
			if (map.containsKey(a)) {
				if (map.get(a) == i) continue;
				c[0] = map.get(a);
				c[1] = i;
			}
		}
		return c;
		
	}

}
