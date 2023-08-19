package Leetcode;

import java.util.*;

public class CF_1857_A {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    	int n = sc.nextInt();
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int count = 0;
    	while (n-- > 0) {
    		if (sc.nextInt()%2 != 0) count++;
    	}
    	if (count%2 == 0) System.out.println("YES");
    	else System.out.println("NO");
    		
    	}
    
		

	}

}
