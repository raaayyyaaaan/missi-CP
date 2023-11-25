package Leetcode;

import java.util.*;

public class weekly_359_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("alice","bob","charlie");
		String s = "abc";
		System.out.println(isAcronym(words, s));
		

	}
    public static boolean isAcronym(List<String> words, String s) {
    	StringBuilder tr = new StringBuilder();
    			
    	for (String i : words) {
    		char t = i.charAt(0);
    		tr.append(t);
    	}
    	String f = tr.toString();
    	if (f.equals(s)) return true;
		return false;
        
    }

}
