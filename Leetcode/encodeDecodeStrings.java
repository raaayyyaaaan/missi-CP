package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class encodeDecodeStrings {
    public static void main(String[] args) {
		String[] strs = {"lint","code","love",",,,","you"};
		List<String> strss = Arrays.asList(strs);
		System.out.println(decode(encode(strss)));
    	

		
	}
    
	public static String encode(List<String> strs) {
		StringBuilder str = new StringBuilder();
		for (String i : strs) {
			str.append(i.length()).append(",").append(i);
		}
		String string = str.toString();
		return string;
		
	}
//	4,lint4,code4,love3,,,,3,you
	public static List<String> decode(String strs) {
		List<String> list = new ArrayList<>();
		int i = 0;
		while (i < strs.length()) {
			int j = i;
			while (strs.charAt(j) != ',') j++;
			int len = Integer.valueOf(strs.substring(i, j));
			j++;
			i = j + len;
			list.add(strs.substring(j, i));
		}
	
		return list;
		
	}
    

	    
	}


