	package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
        HashMap<String, List<String>> map = new HashMap<>();
        for (String i : strs){
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String b = Arrays.toString(c);

            if (map.containsKey(b)){
                map.get(b).add(i);
            }
            else {
            	map.put(b, new ArrayList<>());
                map.get(b).add(i);
            }
        }
        
	 return new ArrayList<>(map.values());
        
    }
	
	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> b = new group_anagrams().groupAnagrams(strs);
		System.out.println(b);
		
	}
}
