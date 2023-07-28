package CodeChef;

import java.util.*;

public class CC_EZSPEAK {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

    	int t = sc.nextInt();
    	while (t-- > 0) {
		System.out.println(hasFourConsecutiveConsonants());
    	}

	}
//	public static  String code() {
//    		int n = sc.nextInt();
//    		int res = 1;
//    		if (n < 4) {
//    			return ("YES");
//    		}
//    		String s = sc.next();	
//    		char[] c = s.toCharArray();
//    		List<Character> list = new ArrayList<>();
//    		
//    		for(int i = 0; i < 4; i++) {
//    			list.add(c[i]);
//    		}
//    		
//    		for (int i = 0; i < 1; i++) {
//    			if(list.contains('a') || list.contains('e') || list.contains('i') || list.contains('o') || list.contains('u')) {
//    				list.remove(0);
//    				list.add(c[i+4]);
//    				
////    				System.out.println(list.size());
//    			}
//    			else {
//    				return ("NO");
//    			}
//    		}
//    
//		return ("YES");
//		
//	}
	public static String hasFourConsecutiveConsonants() {
		int n = sc.nextInt();
		String str = sc.next();
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
	        char c = str.charAt(i);
	        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
	            if ("AEIOUaeiou".indexOf(c) == -1) {
	                count++;
	                if (count == 4) {
	                    return "NO";
	                }
	            } else {
	                count = 0;
	            }
	        } else {
	            count = 0;
	        }
	    }
	    return "YES";
	}


	

}
