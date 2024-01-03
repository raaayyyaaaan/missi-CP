package CodeForces;

import java.util.*;
public class CF_1915A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a==b) System.out.println(c);
            else if (a==c) System.out.println(b);
            else if (c==b) System.out.println(a);
//            System.out.println("hey");
        }
    }
}
