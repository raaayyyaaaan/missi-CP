package CodeForces;

import java.util.*;

public class CF_1862_A {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
//    	int t = sc.nextInt();
//    	while (t-- > 0) {
    		int n = sc.nextInt();
    		int m = sc.nextInt();
    		char[][] mat = new char[n][m];
    		for(int i = 0; i < n; i++) {
    			String s = sc.next();
    			char[] c = s.toCharArray();
    			int k = 0;
    			for(int j = 0; j < m; j++) {
    				mat[i][j] = c[k];
    				k++;
    			}
    			
    		}
    		int a = m;
    		while(m<0) {
    			
    			m--;
    		}
    		System.out.println(mat[2][2]);
//    		System.out.println();
//    	}
    }

}
