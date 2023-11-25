package CodeChef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class START99D_CARDSWIPE {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		HashMap<Integer, Integer> map = new HashMap<>();
    		int n = sc.nextInt();
    		List<Integer> list = new ArrayList<>();
    		for (int i = 0; i < n; i++) {
    			list.add(sc.nextInt());
    		}
    		int res = 0;
    		for (int i : list) {
    			if (map.containsKey(i)) map.remove(i);
    			else map.put(i, 1);
    			res = Math.max(res, map.size());
    		}
    		System.out.println(res);
    	}
    }
}
