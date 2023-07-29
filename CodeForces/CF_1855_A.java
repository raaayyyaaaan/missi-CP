package CodeForces;

import java.util.*;

public class CF_1855_A {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    	List<Integer> list = new ArrayList<>();
    		int n = sc.nextInt();
    		while (n-- > 0) {
    			list.add(sc.nextInt());
    		}
    		int count = 0;
    		for (int i : list) {
    			if (i != list.indexOf(i)+1) continue;
    			else count++;
    		}
    		if (count % 2 == 0) count = count/2;
    		else count = count/2 + 1;
    		System.out.println(count);
    		
    	}
    }
}
