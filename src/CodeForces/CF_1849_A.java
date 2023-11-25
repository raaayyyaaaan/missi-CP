package CodeForces;

import java.util.*;

public class CF_1849_A {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		int h = sc.nextInt();
    		int f = c + h;
    		int l = 0;
    		if (b <= f)  f = b-1;
    		else b = f + 1;
    		l = b + f;
    		System.out.println(l);
    	}
    }
}
