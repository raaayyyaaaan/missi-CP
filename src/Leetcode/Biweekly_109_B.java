package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Biweekly_109_B {
	public static void main(String[] args) {
		String s = "lEetcOdE";
		System.out.println(sortVowels(s));
		
	}
    public static String sortVowels(String s) {
    	List<Integer> list = new ArrayList<>();
    	char[] c = s.toCharArray();
    	List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    	
    	for(int i = 0; i < c.length; i++) {
    		if (vowels.contains(c[i])) {
    			list.add((int) c[i]);
    		}
    	}
    	Collections.sort(list);
    	int j = 0;
    	for(int i = 0; i < c.length; i++) {
    		if (vowels.contains(c[i])) {
    			int a = list.get(j);
    			c[i] = ((char) a);
    			j++;
    		}
    	}


		return new String(c);
    	
    }

}
