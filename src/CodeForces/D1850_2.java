package CodeForces;

import java.util.HashMap;
import java.util.Scanner;

public class D1850_2 {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		HashMap<Integer, Integer> map = new HashMap<>();
    		int a = 0; int b = 0; int c = 0;
    		int n = sc.nextInt();
    		for(int i = 0; i < n; i++) {
    			if (sc.nextInt() < 11) {
    				c = sc.nextInt();
    				if (c > a) {
    					a = c;
    					b = i+1;
    				}
    			}
    			else {
    				sc.nextInt();
    			}
    		}
    		System.out.println(b);
    	}
    
		// TODO Auto-generated method stub

	}

}
