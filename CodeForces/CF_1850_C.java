package CodeForces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF_1850_C {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

		List<Character> list = new ArrayList<>();
		String s = "";
    	int t = sc.nextInt();
    	sc.nextLine();
    	while (t-- > 0) {
    	int m = 8;
	    		while (m-- > 0) {
	    			s = sc.nextLine();
	        		char[] c = s.toCharArray();
						for (char a : c) {
							if (a != '.') {
								list.add(a);
							}
						}
	    		}
		
    		for (int i = 0; i < list.size(); i++) {
    			System.out.print(list.get(i));
    		}
    		System.out.println();
    		list.clear();
    		
    	}
    	
    }
}
