package CodeForces;

import java.util.*;
import java.io.*;

public class CF_1846A {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int count = 0;
    		int y = sc.nextInt();
    		while (y-- > 0) {
    			if (sc.nextInt() > sc.nextInt()) count++;
    		}
    		System.out.println(count);
    		}
    	
    }
}
