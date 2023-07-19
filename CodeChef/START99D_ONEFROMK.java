package CodeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class START99D_ONEFROMK {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while (t-- > 0) {
    		int n = sc.nextInt();
    		List<Integer> list = new ArrayList<>();
    		for (int i = 0; i < n; i++) {
    			list.add(sc.nextInt());
    		}
    		Collections.sort(list);
    		long sum = 0;
    		for(int i : list) {
    			sum += i;
    		}
    		System.out.print(sum + " ");
    		for(int i = 0; i < n-1; i++) {
    			sum -= list.get(i);
    			System.out.print(sum+ " ");
    		}

    		System.out.println();
    	}
    }


}
