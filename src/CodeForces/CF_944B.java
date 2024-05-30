package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class CF_944B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            char[] ch = s.toCharArray();
            boolean flag = false;
            for (int i = 0; i < ch.length-1; i++){
                if (ch[i] != ch[i+1]){
                    char x = ch[i];
                    ch[i] = ch[i+1]; ch[i+1] = x;
                    String u = new String(ch);
                    System.out.println("YES");
                    System.out.println(u);
                    flag = true;
                    break;
                }

            }
            if (!flag) System.out.println("NO");


        }

    }
}

/*go through each char in the string, if any two continuous chars are
different, swap the two, print yes, and print the updated string.
if there aren't any two distinct side-by-side chars, print no.
 */
