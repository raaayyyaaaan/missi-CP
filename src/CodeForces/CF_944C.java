package CodeForces;

import java.util.Scanner;

public class CF_944C {

public static void solve(Scanner sc){
//    Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = "";
        for (int i = 1; i <= 12; i++) {
            if ((i == a) || (i == b)) {
                s += 'x';
            }
            if ((i == c) || (i == d)) {
                s += 'y';
            }
        }
    System.out.println((s.equals("xyxy") || s.equals("yxyx")) ? "yes" : "no");
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-- > 0) {
        solve(sc);
    }

}

}

