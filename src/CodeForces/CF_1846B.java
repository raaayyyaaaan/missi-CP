package CodeForces;

import java.io.*;
import java.util.Scanner;

public class CF_1846B {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[][] arr = new char[3][3];
    	int t = sc.nextInt();
    	while (t-- > 0) {
    	char[] a = sc.next().toCharArray();
    	char[] b = sc.next().toCharArray();
    	char[] c= sc.next().toCharArray();
 
    	
    	for (int i = 0; i < arr.length; i++) {
    		arr[0][i]=a[i];
    	}
    	for (int i = 0; i < arr.length; i++) {
    		arr[1][i]=b[i];
    	}
    	for (int i = 0; i < arr.length; i++) {
    		arr[2][i]=c[i];
    	}
 
    	boolean flag = false;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if ((arr[i][0] == arr[i][1]) && (arr[i][1] == arr[i][2])) {
    			if (arr[i][0] != '.') System.out.println(arr[i][0]);
    			flag = true;
    			break;
    		}
    	}
    	

    	for (int i = 0; i < arr[0].length; i++) {
    		if ((arr[0][i] == arr[1][i]) && (arr[1][i] == arr[2][i])) {

    			if (arr[0][i] != '.') {
    				System.out.println(arr[0][i]); 
    				flag = true;
    				break;
    			}
    		}
    	}
    	
    	
    	if ((arr[0][0] == arr[1][1]) && (arr[1][1] == arr[2][2])) {
			if (arr[0][0] != '.') {
				System.out.println(arr[0][0]);
				flag = true;
				
			}
		}
    	
    	if ((arr[0][2] == arr[1][1]) && (arr[1][1] == arr[2][0])) {
			if (arr[0][2] != '.') {
				System.out.println(arr[0][2]);
				flag = true;
			}
		}
    	
    	if (flag == false) System.out.println("DRAW");
 
    	}	
    	
    }
}