package CodeForces;

import java.util.Scanner;

public class CF_937B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m=sc.nextInt();
            for(int i=0;i<2*m;i++)
            {
                for(int j=0;j<2*m;j++)
                {
                    if((i/2+j/2)%2==0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                System.out.println();
            }

        }

    }
}
