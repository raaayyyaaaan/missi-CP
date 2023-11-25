package CodeForces;

import java.util.*;
import java.io.*;

public class CF_233A {
    public static void main(String[] args) {
    	List<Integer> list = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	int w = t;
    	if (t%2 != 0) System.out.println(-1);
    	else {
    		int a = 1;
    		
    		while (t-- > 0) {
    			list.add(a);
    			a++;
    		}
    		int y = w/2; int q = 0;
    		while (y-- > 0) {
    			int b = list.get(q);
    			list.set(q, list.get(q+1));
    			list.set(q+1, b);
    			q++; q++;
    		}
    	

    	int v = 0;
    	while (w-- > 0) {
        	System.out.print(list.get(v));
        	if (v != list.size()-1) System.out.print(" ");
        	v++;
    	}
    	}
    }
}
