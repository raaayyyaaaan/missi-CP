package CodeForces;

import java.util.*;
import java.io.*;

public class CF_236A {
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			char[] array = a.toCharArray();
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (char b : array) {
				map.put(b, map.getOrDefault(b, 0)+1);
			}
			if (map.size()%2 == 0) System.out.println("CHAT WITH HER!");
			else System.out.println("IGNORE HIM!");
		}
    }
}
