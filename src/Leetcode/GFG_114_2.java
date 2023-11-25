package Leetcode;

import java.util.*;

public class GFG_114_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int diffSum(int n,int m,int arr[]){
    	Arrays.sort(arr);
    	List<Integer> list = new ArrayList<>();
    	for(int i : arr) {
    		list.add(i);
    	}
    	int sum1 = 0;
    	for(int i = 0; i < m; i++) {
    	sum1 += list.get(i);
    	}
    	int sum2 = 0;
//    	for(int i = n-1; i < m; i++) {
//    	sum1 += list.get(i);
//    	}
    	int i = 0; int j = n-1;
    	while(i < m) {
    		sum2 += list.get(j);
    		j--;
    	}
		return sum1-sum2;
        //code here.
    }

}
