package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF_1850_D {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int n = sc.nextInt();
    		int k = sc.nextInt();
    		List<Integer> list = new ArrayList<>();
    		while (n-- > 0) {
    			list.add(sc.nextInt());
    		}
    		System.out.println(method(list, n, k));
    	}
    }
    public static int method(List<Integer> list, int n, int k) {
    		int flag = 0;
    		for (int i = 0; i < list.size()-1; i++) {
    			if (Math.abs(list.get(i) - list.get(i+1)) <= k);
    			else flag = 1;
    		}
    		if (flag == 0) return 0;
    		int count = 0; int res = 0; int index;
    		for (int i : list) {
    			for (int j : list) {
    				if (Math.abs(i-j) <= k) count++;
    			}
    			if (count > res) {
    				res = count; index = i;
    				
    			}
    			count = 0;
    		}
    		return ((list.size()-res));
    		
    	}
    }


