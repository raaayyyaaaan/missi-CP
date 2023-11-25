package CodeForces;

import java.util.*;

public class CF_1855_A {
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			while (t-- > 0) {

				int count = 0;
				int n = sc.nextInt();
				for(int i = 1; i < n+1; i++) {
					if(sc.nextInt() != i) continue;
					else count++;
				}
				if (count % 2 == 0) count = count/2;
				else count = count/2 + 1;
				System.out.println(count);
				
				
			}
		}
    }
}
