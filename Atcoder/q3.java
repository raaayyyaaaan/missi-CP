package Atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
	    int a; int b;
	    boolean flag = true;
	    try (Scanner scan = new Scanner(System.in)) {
	        
	        Integer[] array = new Integer[8];
	        List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < 8; ++i){
	            list.add(scan.nextInt());
	        }
	        list.toArray(array);

	        for (int i = 0; i < array.length - 2; ++i){
	            a = array[i]; b = array[i+1];
	            if (a > b) flag = false;
	        }
	        for (int i : array){
	            if ((i  < 100) || (i > 675)) flag = false;
	            if (i%25 != 0) flag = false;
	        }
	    }
	    if (flag) System.out.println("Yes");
	    else System.out.println("No");

	    }

}
