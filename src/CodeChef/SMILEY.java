package CodeChef;

import java.util.*;
import java.io.*;

class SMILEY {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int q = sc.nextInt();
	    	String a = sc.next();
	    	int start = 0; int count = 0;
	    	for (int i = 0; i < a.length(); ++i) {
	    		if (start != 0) {
	    			if (a.charAt(i) == ')') {
	    				if ((a.charAt(i-1) == ':') || (a.charAt(i-1) == ')')) continue;
	    				else start = 0;
	    			}
	    			else if (a.charAt(i) == ':') {
	    				if (a.charAt(i-1) == ')') 
	    					count++;
	    					start = 0;
	    			}
	    			else start = 0;
	    		}
	    		if (start == 0) {
	    			if (a.charAt(i) == ':') start = 1;
	    			else continue;
	    
	    		}
	    	}
	    	System.out.println(count);
    	}
    }
}

