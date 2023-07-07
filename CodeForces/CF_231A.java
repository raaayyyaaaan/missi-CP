package CodeForces;

import java.util.*;
import java.io.*;

public class CF_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t-- > 0) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	if (a+b+c > 1) count++;
        	
        }
        System.out.println(count);
    }
}
