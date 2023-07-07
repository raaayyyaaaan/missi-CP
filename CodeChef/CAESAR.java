package CodeChef;	

import java.util.*;
import java.io.*;

class CAESAR {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int y = sc.nextInt();
    		String a = sc.next();	
        	String b = sc.next();
        	String c = sc.next();
        	int q;
        	if (a.charAt(0) > b.charAt(0)) q = (b.charAt(0)+26)-a.charAt(0);
        	else q = (a.charAt(0)-b.charAt(0))*-1;
        	
        	int w;
        	for(int i = 0; i < y; i++) {
        		if (c.charAt(i)+q > 122) {
        			w = (c.charAt(i)+q)-122;
        			System.out.print((char)(96+w));
        		}
        		else {
        			w = q;
        			System.out.print((char)(c.charAt(i)+w));
        		}
            	
        	}
        	System.out.println();
    	}
    	
    	
    	
    }
}
