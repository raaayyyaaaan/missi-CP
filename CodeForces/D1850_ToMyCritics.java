package CodeForces;

import java.util.*;
import java.io.*;

public class D1850_ToMyCritics {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		if ((a+b > 9) || (a+c > 9) || (c+b > 9))
    			System.out.println("YES");
    		else System.out.println("NO");
    	}
    }
}
