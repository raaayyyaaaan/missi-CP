package CodeChef;

import java.util.Scanner;

public class START99D_MOZZ {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
//    	int t = sc.nextInt();
//    	while (t-- > 0) {
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int r = sc.nextInt();
    		// number of extra sticks eaten e
    		int e = r/30;
//    		total sticks eaten tot
    		int tot = x + e;
//    		number of plates n
    		int n = tot/y;
    		if (tot%y != 0) n++;
    		System.out.println(n);
//    	}
    }
}
