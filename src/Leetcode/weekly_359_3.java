package Leetcode;

import java.util.*;

public class weekly_359_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
//		List<String> supplierNames = Arrays.asList("sup1", "sup2", "sup3");
		List<List<Integer>> offers = Arrays.asList(
			    Arrays.asList(0, 0, 1),
			    Arrays.asList(0, 2, 2),
			    Arrays.asList(1, 3, 2)
			);

		System.out.println(maximizeTheProfit(n, offers));

	}
	static int solve(int start, int end, int[] dp, List<List<Integer>> offers) {
	    if (start >= end) {
	        return 0;
	    }
	    if (dp[start] != -1) {
	        return dp[start];
	    }
	    List<Integer> duplicate = Arrays.asList(offers.get(start).get(1), Integer.MAX_VALUE, Integer.MAX_VALUE);
	    int index = upperBound(offers, start + 1, end, duplicate);
	    return dp[start] = Math.max(solve(start + 1, end, dp, offers), offers.get(start).get(2) + solve(index, end, dp, offers));
	}

	static int upperBound(List<List<Integer>> offers, int start, int end, List<Integer> duplicate) {
	    int low = start;
	    int high = end;
	    while (low < high) {
	        int mid = low + (high - low) / 2;
	        if (offers.get(mid).get(0) <= duplicate.get(0)) {
	            low = mid + 1;
	        } else {
	            high = mid;
	        }
	    }
	    return low;
	}

	static int maximizeTheProfit(int n, List<List<Integer>> offers) {
	    Collections.sort(offers, new Comparator<List<Integer>>() {
	        @Override
	        public int compare(List<Integer> a, List<Integer> b) {
	            return a.get(0) - b.get(0);
	        }
	    });
	    int[] dp = new int[offers.size()];
	    Arrays.fill(dp, -1);
	    return solve(0, offers.size(), dp, offers);
	}



}
