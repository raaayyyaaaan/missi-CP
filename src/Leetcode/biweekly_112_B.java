package Leetcode;

import java.util.*;
import java.io.*;

public class biweekly_112_B {
    public static void main(String[] args) {
    	String s1 = "abcdba";
    	String s2 = "cabdab";
    	System.out.println(checkStrings(s1, s2));

    }
    public static boolean checkStrings(String s1, String s2) {
    	int[] even = new int[26], odd = new int[26];
    	for(int i = 0; i < s1.length(); i++) {
    		if(i % 2 == 0) {
    			even[s1.charAt(i)-'a']++;
    			even[s2.charAt(i)-'a']--;
    		}
    		else {
    			odd[s1.charAt(i)-'a']++;
    			odd[s2.charAt(i)-'a']--;
    		}
    	}

    	for(int i = 0; i < 26; i++) {
    		if((even[i] != 0) || (odd[i] != 0)) return false;
    	
    	}
    	return true;

    }
}
