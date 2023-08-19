package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class weekly_358_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {51,71,17,24,42};
		System.out.println(maxSum(nums));
	}

    public int maxDig(int n) {
        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n /= 10;
        }
        return max;
    }

    public static int maxSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}


