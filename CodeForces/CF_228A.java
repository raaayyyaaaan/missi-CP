package CodeForces;

import java.util.*;
import java.io.*;

public class CF_228A {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int t = 4;
    	while(t-- > 0) {
    		int a = sc.nextInt();
    		map.put(a, (map.getOrDefault(a, 0)+1));
    	}
    	int b = 4 - map.size();
    	System.out.println(b);
    }
}
