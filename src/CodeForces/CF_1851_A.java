package CodeForces;

import java.util.*;
import java.util.Scanner;

public class CF_1851_A {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int k = sc.nextInt();
    	int h = sc.nextInt();
    	
    	List<Integer> list = new ArrayList<>();
    	List<Integer> list2 = new ArrayList<>();
    	while (n-- > 0) {
    		list.add(sc.nextInt());
    	}
    	int count = 0;
    	for(int i : list) {
	    	if (i == h) continue;
	    	int d = Math.abs(h - i);
	    	if ((d%k == 0) && (d/k < m)) count++;
    	}
    	
    	System.out.println(count);
    	list.clear();
    		
    	}
    }
}
