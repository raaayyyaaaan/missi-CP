package Leetcode;
import java.util.*;

public class isAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram"; String t = "nagaram";
		System.out.println(isAnagram(s, t));

	}
	public static boolean isAnagram(String s, String t) {
		int[] a = new int[26];
		if (s.length() != t.length()) return false;
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - (int)'a']++;
			a[t.charAt(i) - (int)'a']--;
		}
		for(int i : a) {
			if (i != 0) return false;
		}
		return true;}

}
