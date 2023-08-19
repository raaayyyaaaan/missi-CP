import java.util.Scanner;

	public class delte {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        for (int i = 1; i <= t; i++) {
	            solve(scanner);
	        }
	    }

	    public static void solve(Scanner scanner) {
	        String s = scanner.next();
	        int c = 0, p = -1, n = s.length();

	        for (int i = n - 1; i >= 0; i--) {
	            if (s.charAt(i) >= '5') {
	                p = i;
	                c = 1;
	            } else if (c != 0 && s.charAt(i) == '4') {
	                p = i;
	                c = 1;
	            } else {
	                c = 0;
	            }
	        }

	        for (int i = 0; i < p - 1; i++) {
	            System.out.print(s.charAt(i));
	        }

	        if (p != -1) {
	        	System.out.print(p == 0 ? '1' : (char) (s.charAt(p - 1) + 1));
	            while (p < n) {
	                System.out.print(0);
	                p += 1;
	            }
	        } else {
	            System.out.print(s);
	        }

	        System.out.println();
	    }
	}



